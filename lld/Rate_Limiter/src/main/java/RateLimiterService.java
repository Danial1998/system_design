public class RateLimiterService {
    private UserRateLimiter userRateLimiter;
    private DeviceRateLimiter deviceRateLimiter;
    private LocationRateLimiter locationRateLimiter;

    public RateLimiterService(int userLimit, int deviceLimit, int locationLimit, long windowSizeMillis) {
        userRateLimiter = new UserRateLimiter(userLimit, windowSizeMillis);
        deviceRateLimiter = new DeviceRateLimiter(deviceLimit, windowSizeMillis);
        locationRateLimiter = new LocationRateLimiter(locationLimit, windowSizeMillis);
    }

    public boolean checkRequest(String userId, String deviceId, String locationId) {
        return userRateLimiter.isUserAllowed(userId) &&
                deviceRateLimiter.isDeviceAllowed(deviceId) &&
                locationRateLimiter.isLocationAllowed(locationId);
    }
}
