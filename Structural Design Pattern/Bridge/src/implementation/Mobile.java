package implementation;

public class Mobile implements OfficeResource {
    private final String company;
    private final int RAM_size;


    public Mobile(String company, int RAM_size) {
        this.company = company;
        this.RAM_size = RAM_size;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getResourceType() {
        return "MOBILE";
    }

    @Override
    public void use(String name) {
        System.out.println("Mobile is being used by " + name);
    }

    @Override
    public boolean canBeUsedByTesters() {
        return true;
    }
}
