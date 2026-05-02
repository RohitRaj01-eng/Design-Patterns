public class DeliveredState implements  OrderState{
    @Override
    public boolean pay(Order order) {
        System.out.println("Cannot pay for a delivered order");
        return false;
    }

    @Override
    public boolean ship(Order order) {
        System.out.println("Order is already delivered");
        return false;
    }

    @Override
    public boolean cancel(Order order) {
        System.out.println("Delivered order cannot be cancelled");
        return false;
    }

    @Override
    public boolean deliver(Order order) {
        System.out.println("Already delivered");
        return false;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.DELIVERED;
    }
}
