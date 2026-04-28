package implementation;

public interface OfficeResource {
    String getCompany();
    String getResourceType();
    void use(String name);
    boolean canBeUsedByTesters();
}
