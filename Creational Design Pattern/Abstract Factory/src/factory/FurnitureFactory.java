package factory;
import furniture.*;

public interface FurnitureFactory {
   Chair createChair(double cost);
   Table createTable(double cost);
}
