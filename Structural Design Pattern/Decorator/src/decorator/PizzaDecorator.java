package decorator;

import component.Pizza;

abstract public  class PizzaDecorator implements Pizza {
    protected final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public String toString() {
        return "This is " + getName() + " pizza of " + getCost();
    }
}
