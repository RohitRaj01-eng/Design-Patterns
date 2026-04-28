import implementation.*;
import abstraction.*;

void main() {
    OfficeResource laptop = new Laptop("DELL", 8);
    Employee developer = new Developer("Rohit");
    developer.allocateResource(laptop);
    System.out.println(developer);
    OfficeResource mobile = new Mobile("ANDROID", 6);
    developer.allocateResource(mobile);
    System.out.println(developer);
    developer.useResource();
}
