package implementation;

public class Laptop implements OfficeResource {
    private final String company;
    private final int RAM_size;


    public Laptop(String company, int RAM_size) {
        this.company = company;
        this.RAM_size = RAM_size;
    }

    @Override
    public String getCompany() {
        return this.company;
    }

    @Override
    public String getResourceType() {
        return "LAPTOP";
    }

    @Override
    public void use(String name) {
        System.out.println("Laptop is being used by " + name);
    }

    @Override
    public boolean canBeUsedByTesters() {
        return !company.equalsIgnoreCase("APPLE");
    }
}
