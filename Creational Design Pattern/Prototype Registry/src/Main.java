//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Registry registry=new Registry();
    Avatar fighter1=registry.getPrototype(DefaultAvatar.FIGHTER_GUY);
    System.out.println(fighter1);
    registry.register(DefaultAvatar.NORMAL,"Rohit",Gender.MALE);
    Avatar normal=registry.getPrototype(DefaultAvatar.NORMAL);
    System.out.println(normal);
    registry.register(DefaultAvatar.NORMAL,"Raj",Gender.MALE);
    Avatar normal2=registry.getPrototype(DefaultAvatar.NORMAL);
    System.out.println(normal2);
    registry.register(DefaultAvatar.SOLDIER, normal.clone());
    Avatar soldier=registry.getPrototype(DefaultAvatar.SOLDIER);
    System.out.println(soldier);
    soldier.setName("Tanmay");
    System.out.println(soldier);
    Avatar soldier2=registry.getPrototype(DefaultAvatar.SOLDIER);
    System.out.println(soldier2);
}
