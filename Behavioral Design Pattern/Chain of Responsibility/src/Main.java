void main() {
    Handler authHandler=new AuthHandler();
    Handler rateLimiterHandler=new RateLimiterHandler();
    Handler businessLogicHandler=new BusinessLogicHandler();
    authHandler.setNextHandler(rateLimiterHandler).setNextHandler(businessLogicHandler);

    Request request=new Request("token","raj",104);
    authHandler.handle(request);

    Request request1=new Request("token'","rohit",20);
    authHandler.handle(request1);
}
