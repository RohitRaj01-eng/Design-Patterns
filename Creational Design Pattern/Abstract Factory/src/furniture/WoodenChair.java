package furniture;

public class WoodenChair implements Chair{
    private final double cost;

    public WoodenChair(double cost) {
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return this.cost;
    }

    public Material getMaterial() {
        return Material.WOOD;
    }
}
