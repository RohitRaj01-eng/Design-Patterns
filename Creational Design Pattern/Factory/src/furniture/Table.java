package furniture;

public class Table implements Furniture{
    private final double price;

    public Table(double price) {
        this.price = price;
    }

    public void order() {
        System.out.println("Table ordered.");
    }

    public double getPrice(){
        return this.price;
    }
}
