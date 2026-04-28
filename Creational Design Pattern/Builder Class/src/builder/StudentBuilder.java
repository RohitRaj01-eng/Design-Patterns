package builder;

public class StudentBuilder{
    private final String name;
    private final int regNo;
    private String address;
    private boolean isBuilt;

    public StudentBuilder(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public StudentBuilder address(String address) {
        this.address=address;
        return this;
    }

    public Student build() {
        if(isBuilt)throw new IllegalStateException("Object already created using this builder");
        validate();
        isBuilt=true;
        return new Student(this.name,this.regNo,this.address);
    }

    private void validate(){
        if(this.name==null || this.name.isBlank())throw new IllegalArgumentException("Name cannot be empty");
        if(this.address==null || this.address.isBlank())throw new IllegalArgumentException("Address cannot be empty");
        if(this.regNo<=0)throw new IllegalArgumentException("Registration number cannot be zero or negative");
    }
}
