void main() {
    Student.Builder builder=new Student.Builder(909,"Rohit");
    Student student = builder.address("Siwan").build();
    System.out.println(student);
//    Student student2=builder.address("Delhi").build();
//    System.out.println(student2);
}
