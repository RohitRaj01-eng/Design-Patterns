public class ShippedState implements OrderState{
    @Override
    public boolean pay(Order order) {
        System.out.println("Cannot pay for a shipped order.");
        return false;
    }

    @Override
    public boolean ship(Order order) {
        System.out.println("Order is already shipped");
        return false;
    }

    @Override
    public boolean cancel(Order order) {
        System.out.println("Cannot cancel a shipped order");
        return false;
    }

    @Override
    public boolean deliver(Order order) {
        System.out.println("Order Delivered.");
        order.setState(new DeliveredState());
        return true;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.SHIPPED;
    }
}
