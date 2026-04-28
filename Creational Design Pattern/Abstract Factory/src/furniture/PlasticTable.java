package furniture;

public class PlasticTable implements Table{
    private final double cost;

    public PlasticTable(double cost) {
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
