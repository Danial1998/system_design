public class UserRateLimiter extends RateLimiter {

    public UserRateLimiter(int maxRequests, long windowSizeMillis) {
        super(maxRequests, windowSizeMillis);
    }

    public boolean isUserAllowed(String userId) {
        return isAllowed(userId);
    }
}
