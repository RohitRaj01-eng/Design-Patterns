
public class Student {
    private final String name;
    private final int regNo;
    private final String address;

    private Student(Builder builder){
        this.name=builder.name;
        this.regNo=builder.regNo;
        this.address=builder.address;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return this.name + " having registration number " + this.regNo + " belongs to " + this.address;
    }

    public static class Builder{
        private final String name;
        private final int regNo;
        private String address;
        private boolean isBuilt;

        public Builder(int regNo, String name) {
            this.regNo = regNo;
            this.name = name;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            if(isBuilt)throw new IllegalStateException("Object already built using this builder");
            validate();
            isBuilt=true;
            return new Student(this);
        }

        private void validate(){
            if(this.name==null || this.name.isBlank())throw new IllegalArgumentException("Name cannot be empty");
            if(this.address==null || this.address.isBlank())throw new IllegalArgumentException("Address cannot be empty");
            if(this.regNo<=0)throw new IllegalArgumentException("Registration number cannot be zero or negative");
        }
    }
}
