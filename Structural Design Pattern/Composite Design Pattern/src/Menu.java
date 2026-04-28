import java.util.*;

public class Menu implements RestaurantMenu {
    private final String name;
    private final List<RestaurantMenu> menuItems=new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(RestaurantMenu menu){
        menuItems.add(menu);
    }

    public void remove(RestaurantMenu menu){
        menuItems.remove(menu);
    }

    @Override
    public double getCost() {
        double totalcost=0;
        for(RestaurantMenu item:menuItems){
            totalcost+=item.getCost();
        }
        return totalcost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String display() {
        StringBuilder str=new StringBuilder();
        str.append(this.name).append("[");
        for(int i=0;i< menuItems.size();i++){
            str.append(menuItems.get(i).display());
            if(i< menuItems.size()-1)str.append(", ");
        }
        str.append("]");
        return str.toString();
    }
}
