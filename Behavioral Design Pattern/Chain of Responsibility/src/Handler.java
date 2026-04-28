abstract public class Handler {
    private Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void handle(Request request){
        if(process(request) && nextHandler!=null){
            this.nextHandler.handle(request);
        }
    }

    protected abstract boolean process(Request request);
}
