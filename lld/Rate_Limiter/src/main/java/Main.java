public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create RateLimiterService with limits
        RateLimiterService rateLimiterService = new RateLimiterService(5, 5, 5, 60000);  // 1 minute window

        // Example User, Device, and Location IDs
        String userId = "user123";
        String deviceId = "deviceABC";
        String locationId = "locationX";

        // Simulating requests
        for (int i = 0; i < 7; i++) {
            boolean isAllowed = rateLimiterService.checkRequest(userId, deviceId, locationId);
            System.out.println("Request " + (i + 1) + ": " + (isAllowed ? "Allowed" : "Denied"));
            Thread.sleep(500); // Simulate small delay between requests
        }
    }
}
