package factory;

import furniture.*;

public class PlasticFactory implements FurnitureFactory {

    @Override
    public Chair createChair(double cost) {
        return new PlasticChair(cost);
    }

    @Override
    public Table createTable(double cost) {
        return new PlasticTable(cost);
    }
}
