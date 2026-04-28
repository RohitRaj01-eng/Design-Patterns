public class BusinessLogicHandler extends Handler{
    @Override
    protected boolean process(Request request) {
        System.out.println("Business logic executed for " + request.userId());
        return true;
    }
}
