void main() {
    Menu starter=new Menu("Starter");
    Menu vegStarter=new Menu("Veg");
    Menu nonvegStarter=new Menu("Non-veg");
    starter.add(vegStarter);
    starter.add(nonvegStarter);
    MenuItem paneerTikka=new MenuItem("Paneer Tikka",120);
    vegStarter.add(paneerTikka);
    MenuItem crispyCorn=new MenuItem("Crispy Corn",80);
    vegStarter.add(crispyCorn);
    MenuItem chickenTandoor=new MenuItem("Chicken Tandoor",220);
    nonvegStarter.add(chickenTandoor);
    MenuItem fishFry=new MenuItem("Fish Fry",380);
    nonvegStarter.add(fishFry);

    System.out.println(starter.getCost());
    System.out.println(starter.getName());
    System.out.println(starter.display());

    vegStarter.remove(crispyCorn);
    System.out.println(starter.display());
}
