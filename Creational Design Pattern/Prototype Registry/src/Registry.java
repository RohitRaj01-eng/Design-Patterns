import java.util.*;

public class Registry {
    private final Map<DefaultAvatar,Avatar> registry=new HashMap<>();

    Registry(){
        registry.putIfAbsent(DefaultAvatar.FIGHTER_GUY,new Avatar(Gender.MALE,"Raj"));
        registry.putIfAbsent(DefaultAvatar.FIGHTER_GIRL,new Avatar(Gender.FEMALE,"Swati"));
        registry.putIfAbsent(DefaultAvatar.BOMBER_GUY,new Avatar(Gender.MALE,"Madhan"));
        registry.putIfAbsent(DefaultAvatar.BOMBER_GIRL,new Avatar(Gender.FEMALE,"Hema"));
    }

    public void register(DefaultAvatar defaultAvatar, String name, Gender gender){
        registry.putIfAbsent(defaultAvatar,new Avatar(gender,name));
    }

    public void register(DefaultAvatar defaultAvatar, Avatar avatar){
        registry.putIfAbsent(defaultAvatar,avatar.clone());
    }

    public Avatar getPrototype(DefaultAvatar defaultAvatar){
        Avatar avatar=registry.get(defaultAvatar);
        if(avatar==null)throw new IllegalArgumentException("No prototype present for " + defaultAvatar);
        return avatar.clone();
    }
}
