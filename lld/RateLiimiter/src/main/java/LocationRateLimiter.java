// Location-based rate limiter
class LocationRateLimiter extends RateLimiter {
    public LocationRateLimiter() {
        super(200);  // Example limit for location
    }
}