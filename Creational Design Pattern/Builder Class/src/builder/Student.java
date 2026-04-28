package builder;

public class Student {
    private final String name;
    private final int regNo;
    private final String address;

    Student(String name,int regNo,String address){
        this.name=name;
        this.regNo=regNo;
        this.address=address;
    }

    @Override
    public String toString() {
        return this.name + " having registration number " + this.regNo + " belongs to " + this.address;
    }
}
