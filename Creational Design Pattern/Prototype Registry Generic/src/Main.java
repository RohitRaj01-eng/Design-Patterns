void main() {
    Registry<AvatarTypes,Avatar> regitry=new Registry<>();
    Avatar rohit=new Avatar("Rohit",Gender.MALE);
    regitry.register(AvatarTypes.FIGHTER,rohit);
    Avatar ishita=new Avatar("Ishita",Gender.FEMALE);
    regitry.register(AvatarTypes.SOLDIER,ishita);

    Avatar bhoomika=regitry.getPrototype(AvatarTypes.SOLDIER);

    System.out.println(rohit);
    System.out.println(ishita);
    System.out.println(bhoomika);

    bhoomika.setName("Bhoomika");
    System.out.println(ishita);
    System.out.println(bhoomika);

}
