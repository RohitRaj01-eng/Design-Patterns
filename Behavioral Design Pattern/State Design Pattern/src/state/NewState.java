public class NewState implements OrderState {
    @Override
    public boolean pay(Order order) {
        System.out.println("Payment done!");
        order.setState(new PaidState());
        return true;
    }

    @Override
    public boolean ship(Order order) {
        System.out.println("Order cannot be shipped without payment");
        return false;
    }

    @Override
    public boolean cancel(Order order) {
        System.out.println("Order cancelled!");
        order.setState(new CancelledState());
        return true;
    }

    @Override
    public boolean deliver(Order order) {
        System.out.println("Cannot delivered unshipped order");
        return false;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.NEW;
    }
}
