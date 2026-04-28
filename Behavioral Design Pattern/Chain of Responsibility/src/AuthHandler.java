public class AuthHandler extends Handler{
    @Override
    protected boolean process(Request request) {
        String token= request.token();
        if(token==null || token.isBlank()){
            System.out.println("Auth failed!");
            return false;
        }
        System.out.println("Authenticated");
        return true;
    }
}
