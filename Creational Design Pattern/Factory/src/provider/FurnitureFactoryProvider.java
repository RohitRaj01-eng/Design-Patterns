package provider;

import factory.*;

public class FurnitureFactoryProvider {

    public FurnitureFactory getFactory(FurnitureType type){
        return switch (type){
            case CHAIR -> new ChairFactory();
            case TABLE -> new TableFactory();
        };
    }
}
