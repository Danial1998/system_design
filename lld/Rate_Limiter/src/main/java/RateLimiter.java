import java.time.Instant;
import java.util.*;

public class RateLimiter {
    protected int maxRequests;
    protected long windowSizeMillis;
    protected Map<String, Queue<Long>> requestTimestamps;

    public RateLimiter(int maxRequests, long windowSizeMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeMillis = windowSizeMillis;
        this.requestTimestamps = new HashMap<>();
    }

    // Method to check if a request is allowed based on identifier
    public boolean isAllowed(String identifier) {
        long currentTime = Instant.now().toEpochMilli();
//        Queue<Long> timestamps = requestTtimestamps.computeIfAbsent(identifier, k -> new LinkedList<>());
        Queue<Long> timestamps = requestTimestamps.get(identifier);
        if (timestamps == null) {
            timestamps = new LinkedList<>();
            requestTimestamps.put(identifier, timestamps);
        }

        // Remove outdated timestamps
        while (!timestamps.isEmpty() && currentTime - timestamps.peek() > windowSizeMillis) {
            timestamps.poll();
        }

        // Check if the request can be allowed
        if (timestamps.size() < maxRequests) {
            timestamps.add(currentTime);
            return true;  // Request is allowed
        }

        return false;  // Request is denied
    }
}
