import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeWindowStore {
    private Map<String,KeyValueEntry> store;
    private TreeMap<Instant,String> timeMap;
    private static final long one_hour = 5;

    public TimeWindowStore(){
        store = new HashMap<>();
        timeMap = new TreeMap<>();
    }

    private void evictOldEntries(){  //method to delete expired entries
        Instant oneHourAgo = Instant.now().minusSeconds(one_hour);
        while(!timeMap.isEmpty() && timeMap.firstKey().isBefore(oneHourAgo)){
            Instant oldestTime = timeMap.firstKey();
            String keyToRemove = timeMap.get(oldestTime);
            timeMap.remove(oldestTime);
            store.remove(keyToRemove);
        }
    }

    public void put(String key, double  value){
        evictOldEntries();

        //if same key already exists, remove the oldTime from timeMap
        if(store.containsKey(key)){
            Instant oldTime = store.get(key).creationTime;
            timeMap.remove(oldTime);
        }

        Instant currentTime = Instant.now();
        KeyValueEntry newEntry = new KeyValueEntry(key,value,currentTime);

        //add the new entry
        store.put(key,newEntry);
        timeMap.put(currentTime,key);
    }

    public Double get(String key){
        evictOldEntries();

        if(!store.containsKey(key)) return null;

        return store.get(key).value;
    }

    public Double average(){
           evictOldEntries();

           if (store.isEmpty()) return 0.0;

           double sum = 0;
           int count = 0;

           for(KeyValueEntry entry : store.values()){
               sum += entry.value;
               count++;
           }

           return sum/count;
    }
}
