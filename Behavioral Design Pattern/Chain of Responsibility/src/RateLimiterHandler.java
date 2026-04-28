public class RateLimiterHandler extends Handler{
    private static final int MAX_REQUESTS = 100;
    @Override
    protected boolean process(Request request) {
        int numOfRequest= request.requestCount();
        if(numOfRequest<=0 || numOfRequest>MAX_REQUESTS) {
            System.out.println("Rate limiting failed");
            return false;
        }
        System.out.println("Rate limiting passed.");
        return true;
    }
}
