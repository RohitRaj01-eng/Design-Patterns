import java.util.concurrent.atomic.AtomicInteger;

public class Avatar implements Prototype<Avatar>{
    private final int id;
    private final Gender gender;
    private String name;
    private static final AtomicInteger ID=new AtomicInteger(0);

    public Avatar(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
        this.id=ID.getAndIncrement();
    }

    private Avatar(Avatar avatar){
        this.name= avatar.name;
        this.gender=avatar.gender;
        this.id=ID.getAndIncrement();
    }

    @Override
    public Avatar clone(){
        return new Avatar(this);
    }

    @Override
    public String toString() {
        return this.name + " has gender as " + this.gender + " having id " + this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
