package furniture;

public class PlasticChair implements Chair{
    private final double cost;

    public PlasticChair(double cost) {
        this.cost = cost;
    }

    @Override
    public double getPrice() {
        return this.cost;
    }

    public Material getMaterial() {
        return Material.PLASTIC;
    }
}
