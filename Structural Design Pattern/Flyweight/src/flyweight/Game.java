package flyweight;

import java.util.*;

public class Game {
    private final List<Bullet> bullets=new ArrayList<>();
    private final BulletFactory bulletFactory=new BulletFactory();

    public void fireBullet(int x,int y,Direction direction,String sprite,String color,int damage,double speed){
        BulletType type=bulletFactory.getBulletType(sprite,color,damage,speed);
        bullets.add(new Bullet(x,y,direction,type));
    }

    public void moveAll(){
        for(Bullet bullet:bullets)
            bullet.move();
    }

    public  void renderAll(){
        for(Bullet bullet:bullets)
            bullet.render();
    }

    public int totalBullets(){
        return bullets.size();
    }

    public int totalBulletTypes(){
        return bulletFactory.totalTypes();
    }
}
