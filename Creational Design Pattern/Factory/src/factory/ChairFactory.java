package factory;

import furniture.*;

public class ChairFactory extends FurnitureFactory{
    @Override
    protected Furniture createFurniture(double cost) {
        return new Chair(cost);
    }
}
