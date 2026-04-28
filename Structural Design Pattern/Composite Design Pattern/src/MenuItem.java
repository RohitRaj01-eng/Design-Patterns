public class MenuItem implements RestaurantMenu {
    private final String name;
    private final double cost;

    public MenuItem(String name, double cost) {
        if(cost<0)throw new IllegalArgumentException("Cost cannot be less than zero");
        this.name = name;
        this.cost = cost;
    }


    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String display() {
        return name;
    }
}
