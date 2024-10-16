public class Main {

    public static void main(String[] args) {
        RateLimiterService service = new RateLimiterService();

        // Simulate some requests
        String userId = "user123";
        String location = "US";
        String deviceId = "device456";

        // Make multiple user-based requests
        for (int i = 0; i < 105; i++) {
            boolean allowed = service.checkUserRateLimiting(userId);
            System.out.println("User-based rate limiting: " + allowed);
        }

        // Make multiple location-based requests
        for (int i = 0; i < 210; i++) {
            boolean allowed = service.checkLocationRateLimiting(location);
            System.out.println("Location-based rate limiting: " + allowed);
        }

        // Make multiple device-based requests
        for (int i = 0; i < 55; i++) {
            boolean allowed = service.checkDeviceRateLimiting(deviceId);
            System.out.println("Device-based rate limiting: " + allowed);
        }
    }
}
