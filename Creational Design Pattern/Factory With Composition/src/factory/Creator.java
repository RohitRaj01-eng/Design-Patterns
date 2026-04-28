package factory;

import furniture.Furniture;

@FunctionalInterface
public interface Creator {
    Furniture create(double cost);
}
