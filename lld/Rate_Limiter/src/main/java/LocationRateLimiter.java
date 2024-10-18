public class LocationRateLimiter extends RateLimiter {

    public LocationRateLimiter(int maxRequests, long windowSizeMillis) {
        super(maxRequests, windowSizeMillis);
    }

    public boolean isLocationAllowed(String locationId) {
        return isAllowed(locationId);
    }
}
