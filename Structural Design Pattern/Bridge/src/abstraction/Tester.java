package abstraction;

import implementation.OfficeResource;

public class Tester extends Employee {
    public Tester(String name) {
        super(name);
    }

    @Override
    public void useResource() {
        for(OfficeResource resource:this.allocatedResources){
            if(!resource.canBeUsedByTesters())throw new IllegalStateException("Testers are not allowed to use " + resource.getCompany());
            resource.use(this.name);
        }
    }
}
