package factory;

import furniture.*;

public class WoodenFactory implements FurnitureFactory{

    @Override
    public Chair createChair(double cost) {
        return new WoodenChair(cost);
    }

    @Override
    public Table createTable(double cost) {
        return new WoodenTable(cost);
    }
}
