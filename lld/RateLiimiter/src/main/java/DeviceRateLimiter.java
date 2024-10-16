// Device-based rate limiter
class DeviceRateLimiter extends RateLimiter {
    public DeviceRateLimiter() {
        super(50);  // Example limit for device
    }
}