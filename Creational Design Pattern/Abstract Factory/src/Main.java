import factory.*;
import furniture.*;
import service.FurnitureService;

void main() {
    FurnitureService service=new FurnitureService();
    // plastic furniture
    FurnitureFactory plasticFactory= new PlasticFactory();
    Chair chair = plasticFactory.createChair(2000);
    System.out.println(service.getPrice(chair));
    System.out.println(service.getMaterial(chair));
    Table table= plasticFactory.createTable(1200);
    System.out.println(service.getPrice(table));
    System.out.println(service.getMaterial(table));

    // wooden Furniture
    FurnitureFactory woodenFactory=new WoodenFactory();
    Chair woodenChair=woodenFactory.createChair(5000);
    System.out.println(service.getPrice(woodenChair));
    System.out.println(service.getMaterial(woodenChair));
    Table woodenTable=woodenFactory.createTable(8000);
    System.out.println(service.getPrice(woodenTable));
    System.out.println(service.getMaterial(woodenTable));
}
