package component;

public class BasicPizza implements Pizza {
    private final String name;
    private final int cost;


    public BasicPizza(String name, int cost) {
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
    public String toString() {
        return "This is " + this.name + " pizza of " + getCost();
    }
}
