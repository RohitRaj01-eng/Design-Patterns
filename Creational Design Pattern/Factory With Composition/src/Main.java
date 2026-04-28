import factory.*;
import furniture.*;

void main() {
    FurnitureFactory chairFactory=new FurnitureFactory(cost->new Chair(cost));
    Furniture chair=chairFactory.orderFurniture(1000);
    System.out.println(chair.getPrice());
    FurnitureFactory tableFactory=new FurnitureFactory(new Creator() {
        @Override
        public Furniture create(double cost) {
            return new Table(cost);
        }
    });
    Furniture table=tableFactory.orderFurniture(3500);
    System.out.println(table.getPrice());
}
