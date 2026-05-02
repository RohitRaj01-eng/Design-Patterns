public class PaidState implements OrderState {
    @Override
    public boolean pay(Order order) {
        System.out.println("Already paid!");
        return false;
    }

    @Override
    public boolean ship(Order order) {
        System.out.println("Order shipped!");
        order.setState(new ShippedState());
        return true;
    }

    @Override
    public boolean cancel(Order order) {
        System.out.println("Cannot cancel a paid order");
        return false;
    }

    @Override
    public boolean deliver(Order order) {
        System.out.println("Item not shipped yet");
        return false;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.PAID;
    }
}
