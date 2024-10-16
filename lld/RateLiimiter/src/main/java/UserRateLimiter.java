// User-based rate limiter
class UserRateLimiter extends RateLimiter {
    public UserRateLimiter() {
        super(100);  // Example limit for user
    }
}