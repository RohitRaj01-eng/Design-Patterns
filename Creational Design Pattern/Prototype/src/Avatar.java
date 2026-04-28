import java.util.concurrent.atomic.AtomicInteger;

public class Avatar implements Prototype<Avatar>{
    private final int id;
    private final Gender gender;
    private String name;

    private final static AtomicInteger ID=new AtomicInteger(0);

    public Avatar(String name,Gender gender) {
        this.name=name;
        this.gender = gender;
        this.id=ID.getAndIncrement();
    }

    private Avatar(Avatar avatar){
        this.gender=avatar.gender;
        this.name= avatar.name;
        this.id=ID.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }


    @Override
    public Avatar clone() {
        return new Avatar(this);
    }

    @Override
    public String toString() {
        return this.name + " is " + this.gender + " avatar with id " + this.id;
    }
}
