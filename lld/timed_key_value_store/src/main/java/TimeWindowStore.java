import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TimeWindowStore {

    private final Map<String, KeyValueEntry> store;
    private final TreeMap<Instant, String> timeMap;
    private static final long one_hour = 5;

    // Read-write lock
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public TimeWindowStore() {
        store = new HashMap<>();
        timeMap = new TreeMap<>();
    }

    // Method to delete expired entries
    private void evictOldEntries() {
        Instant oneHourAgo = Instant.now().minusSeconds(one_hour);

        rwLock.writeLock().lock();  // Acquire write lock for eviction
        try {
            while (!timeMap.isEmpty() && timeMap.firstKey().isBefore(oneHourAgo)) {
                Instant oldestTime = timeMap.firstKey();
                String keyToRemove = timeMap.get(oldestTime);
                timeMap.remove(oldestTime);
                store.remove(keyToRemove);
            }
        } finally {
            rwLock.writeLock().unlock();  // Release the write lock
        }
    }

    public void put(String key, double value) {
        evictOldEntries();  // Evict expired entries before adding new ones

        rwLock.writeLock().lock();  // Acquire write lock for modification
        try {
            // If the same key already exists, remove the oldTime from timeMap
            if (store.containsKey(key)) {
                Instant oldTime = store.get(key).creationTime;
                timeMap.remove(oldTime);
            }

            Instant currentTime = Instant.now();
            KeyValueEntry newEntry = new KeyValueEntry(key, value, currentTime);

            // Add the new entry
            store.put(key, newEntry);
            timeMap.put(currentTime, key);
        } finally {
            rwLock.writeLock().unlock();  // Release the write lock
        }
    }

    public Double get(String key) {
        evictOldEntries();  // Ensure old entries are removed

        rwLock.readLock().lock();  // Acquire read lock
        try {
            if (!store.containsKey(key)) return null;
            return store.get(key).value;
        } finally {
            rwLock.readLock().unlock();  // Release the read lock
        }
    }

    public Double average() {
        evictOldEntries();  // Ensure old entries are removed

        rwLock.readLock().lock();  // Acquire read lock
        try {
            if (store.isEmpty()) return 0.0;

            double sum = 0;
            int count = 0;

            for (KeyValueEntry entry : store.values()) {
                sum += entry.value;
                count++;
            }

            return sum / count;
        } finally {
            rwLock.readLock().unlock();  // Release the read lock
        }
    }
}