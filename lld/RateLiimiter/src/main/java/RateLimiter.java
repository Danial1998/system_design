import java.time.Instant;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.HashMap;

class RateLimiter {
    protected final int MAX_REQUESTS;
    protected final long TIME_WINDOW_IN_MS = 60000;  // 1 minute in milliseconds
    protected final Map<String, Queue<Long>> requestTimestamps = new HashMap<>();

    public RateLimiter(int maxRequests) {
        this.MAX_REQUESTS = maxRequests;
    }

    public boolean isAllowed(String identifier) {
        long currentTime = Instant.now().toEpochMilli();

        // Simplified version: check if queue exists and create it if not
        Queue<Long> timestamps = requestTimestamps.get(identifier);
        if (timestamps == null) {
            timestamps = new LinkedList<>();
            requestTimestamps.put(identifier, timestamps);
        }

        // Remove outdated requests that are outside the 1-minute window
        while (!timestamps.isEmpty() && (currentTime - timestamps.peek()) > TIME_WINDOW_IN_MS) {
            timestamps.poll();  // Remove from front
        }

        // Check if the current request can be allowed
        if (timestamps.size() < MAX_REQUESTS) {
            timestamps.offer(currentTime);  // Add to back
            return true;
        } else {
            return false;
        }
    }
}