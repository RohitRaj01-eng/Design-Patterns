package flyweight;
import java.util.*;

public class BulletFactory {
    private final Map<String,BulletType> cache=new HashMap<>();

    public BulletType getBulletType(String sprite, String color, int damage, double speed) {
        String key=sprite + '|' + color + '|' + damage + '|' + speed;
        BulletType type=cache.get(key);
        if (type == null) {
            type = new BulletType(sprite, color, damage, speed);
            cache.put(key, type);
        }
        return type;
    }

    public int totalTypes(){
        return cache.size();
    }

}
