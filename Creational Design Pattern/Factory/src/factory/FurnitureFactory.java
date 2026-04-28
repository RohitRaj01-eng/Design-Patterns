package factory;

import furniture.*;

abstract public class FurnitureFactory {

    abstract protected Furniture createFurniture(double cost);
    public Furniture orderFurniture(double cost){
        Furniture furniture=createFurniture(cost);
        furniture.order();
        return furniture;
    }
}
