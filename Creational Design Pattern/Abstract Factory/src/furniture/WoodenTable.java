package furniture;

public class WoodenTable implements Table{
    private final double cost;

    public WoodenTable(double cost) {
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
