package factory;

import furniture.Furniture;

public class FurnitureFactory {
    private final Creator creator;

    public FurnitureFactory(Creator creator) {
        this.creator = creator;
    }

    public Furniture orderFurniture(double cost){
        Furniture furniture=creator.create(cost);
        furniture.order();
        return furniture;
    }
}
