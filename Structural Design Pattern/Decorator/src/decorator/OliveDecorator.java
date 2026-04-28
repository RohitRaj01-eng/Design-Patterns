package decorator;

import component.Pizza;

public class OliveDecorator extends PizzaDecorator {
    private final double toppingCost;
    public OliveDecorator(Pizza pizza, double cost) {
        super(pizza);
        this.toppingCost=cost;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+toppingCost;
    }

    @Override
    public String getName() {
        return pizza.getName()+" + Olive";
    }
}
