public class RateLimiterService {
    private final RateLimiterContext context = new RateLimiterContext();

    public boolean checkUserRateLimiting(String userId) {
        context.setRateLimiter(new UserRateLimiter());
        return context.isRequestAllowed(userId);
    }

    public boolean checkLocationRateLimiting(String location) {
        context.setRateLimiter(new LocationRateLimiter());
        return context.isRequestAllowed(location);
    }

    public boolean checkDeviceRateLimiting(String deviceId) {
        context.setRateLimiter(new DeviceRateLimiter());
        return context.isRequestAllowed(deviceId);
    }
}
