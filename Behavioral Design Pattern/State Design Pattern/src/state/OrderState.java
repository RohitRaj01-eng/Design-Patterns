public interface OrderState {
    boolean pay(Order order);
    boolean ship(Order order);
    boolean cancel(Order order);
    boolean deliver(Order order);
    OrderStatus getOrderStatus();
}
