package decorator;

import component.Pizza;

public class CapsicumDecorator extends PizzaDecorator {
    private final double toppingCost;
    public CapsicumDecorator(Pizza pizza, double cost) {
        super(pizza);
        this.toppingCost=cost;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+toppingCost;
    }

    @Override
    public String getName() {
        return pizza.getName()+" + Capsicum";
    }
}
