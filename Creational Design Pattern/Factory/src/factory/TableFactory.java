package factory;

import furniture.*;

public class TableFactory extends FurnitureFactory{
    @Override
    protected Furniture createFurniture(double cost) {
        return new Table(cost);
    }
}
