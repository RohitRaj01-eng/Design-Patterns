import component.*;
import decorator.*;

void main() {
  Pizza pizza=new BasicPizza("Farmhouse",350);
  System.out.println(pizza);
  pizza=new CapsicumDecorator(pizza,40);
  System.out.println(pizza);
  pizza=new OliveDecorator(pizza,80);
  System.out.println(pizza);
}
