package abstraction;

import implementation.OfficeResource;
import java.util.*;

abstract public class Employee {
    protected final String name;
    protected final List<OfficeResource> allocatedResources;

    public Employee(String name) {
        this.name = name;
        this.allocatedResources=new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public void allocateResource(OfficeResource resource){
        allocatedResources.add(resource);
    }

    protected String getAllResources(){
        StringBuilder str=new StringBuilder();
        int n=allocatedResources.size();
        for(int i=0;i<n;i++){
            str.append(allocatedResources.get(i).getResourceType());
            if(i<n-1)str.append(", ");
        }
        return str.toString();
    }

    public abstract void useResource();

    @Override
    public String toString() {
        return this.name + " has all these resources allocated: " + getAllResources();
    }
}
