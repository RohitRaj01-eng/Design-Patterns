package flyweight;

public class Bullet {
    private int x;
    private int y;
    private Direction direction;
    private final BulletType bulletType;


    public Bullet(int x, int y, Direction direction, BulletType bulletType) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.bulletType = bulletType;
    }

    void move(){
        switch (direction){
            case UP    -> y++;
            case DOWN  -> y--;
            case LEFT  -> x--;
            case RIGHT -> x++;
        }
        System.out.println("bullet move");
    }

    void render(){
        bulletType.render(x,y,direction);
    }

}
