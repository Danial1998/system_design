// Context class to switch between rate limiters
class RateLimiterContext {
    private RateLimiter rateLimiter;

    public void setRateLimiter(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }

    public boolean isRequestAllowed(String identifier) {
        return rateLimiter.isAllowed(identifier);
    }
}