public class DeviceRateLimiter extends RateLimiter {

    public DeviceRateLimiter(int maxRequests, long windowSizeMillis) {
        super(maxRequests, windowSizeMillis);
    }

    public boolean isDeviceAllowed(String deviceId) {
        return isAllowed(deviceId);
    }
}
