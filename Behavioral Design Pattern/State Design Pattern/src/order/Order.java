import state.*;

public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new NewState();
    }

    public void setState(OrderState orderState) {
        this.orderState = orderState;
    }

    public boolean pay(){
        return orderState.pay(this);
    }

    public boolean ship(){
        return orderState.ship(this);
    }

    public boolean cancel(){
        return orderState.cancel(this);
    }

    public boolean deliver(){
        return orderState.deliver(this);
    }

    public OrderStatus getOrderStatus() {
        return orderState.getOrderStatus();
    }
}
