import factory.*;
import furniture.*;
import provider.FurnitureFactoryProvider;

void main() {
    FurnitureFactoryProvider provider=new FurnitureFactoryProvider();
    FurnitureFactory chairFactory=provider.getFactory(FurnitureType.CHAIR);
    Furniture chair=chairFactory.orderFurniture(2000);
    FurnitureFactory tableFactory=provider.getFactory(FurnitureType.TABLE);
    Furniture table=tableFactory.orderFurniture(10000);
    System.out.println(chair.getPrice());
    System.out.println(table.getPrice());
}
