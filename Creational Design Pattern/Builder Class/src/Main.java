import builder.*;

void main() {
    StudentBuilder builder = new StudentBuilder("Rohit", 11711339);
    Student student=builder.address("Siwan").build();
    System.out.println(student);
//    Student student2=builder.address("Delhi").build(); // error
}