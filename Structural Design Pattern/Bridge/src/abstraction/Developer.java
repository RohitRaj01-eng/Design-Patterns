package abstraction;

import implementation.OfficeResource;

public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public void useResource() {
        for(OfficeResource resource:this.allocatedResources){
            resource.use(this.name);
        }
    }
}
