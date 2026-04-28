package furniture;

public class Chair implements Furniture{
    private final double price;

    public Chair(double price) {
        this.price = price;
    }

    @Override
    public void order() {
        System.out.println("Chair ordered.");
    }

    public double getPrice(){
        return this.price;
    }
}
