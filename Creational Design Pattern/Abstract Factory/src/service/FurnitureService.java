package service;

import furniture.*;

public class FurnitureService {

    public double getPrice(Furniture furniture){
        System.out.println("Logging the cost getting request by the user");
        return furniture.getPrice();
    }

    public Material getMaterial(Furniture furniture){
        System.out.println("Logging material request by the user");
        return furniture.getMaterial();
    }
}
