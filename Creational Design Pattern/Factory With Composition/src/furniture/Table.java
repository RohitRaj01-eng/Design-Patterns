package furniture;

public class Table implements Furniture{
    private final double price;

    public Table(double price) {
        this.price = price;
    }

    @Override
    public void order() {
        System.out.println("Table ordered.");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
