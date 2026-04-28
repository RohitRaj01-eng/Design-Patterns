void main() {
    Avatar raj=new Avatar("Raj",Gender.MALE);
    System.out.println(raj);
    Avatar swati=new Avatar("Swati",Gender.FEMALE);
    System.out.println(swati);
    Avatar rajClone=raj.clone();
    System.out.println(rajClone);
}
