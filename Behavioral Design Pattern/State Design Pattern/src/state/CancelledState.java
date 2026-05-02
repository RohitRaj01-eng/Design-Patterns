public class CancelledState implements OrderState {
    @Override
    public boolean pay(Order order) {
        System.out.println("Cannot pay for a cancelled order!!!");
        return false;
    }

    @Override
    public boolean ship(Order order) {
        System.out.println("Cannot ship a cancelled order");
        return false;
    }

    @Override
    public boolean cancel(Order order) {
        System.out.println("Order is already cancelled");
        return false;
    }

    @Override
    public boolean deliver(Order order) {
        System.out.println("Cannot deliver cancelled item");
        return false;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return OrderStatus.CANCELLED;
    }
}
