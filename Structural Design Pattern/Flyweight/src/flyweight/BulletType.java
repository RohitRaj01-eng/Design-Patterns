package flyweight;

public class BulletType {
    private final String sprite;
    private final String color;
    private final int damage;
    private final double speed;


    public BulletType(String sprite, String color, int damage, double speed) {
        this.sprite = sprite;
        this.color = color;
        this.damage = damage;
        this.speed = speed;
    }

    void render(int x, int y, Direction direction) {
        System.out.println(
                sprite + " " + color +
                        " bullet [damage=" + damage +
                        ", speed=" + speed +
                        "] at (" + x + "," + y + ") moving " + direction
        );
    }
}
