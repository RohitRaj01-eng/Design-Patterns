import flyweight.Direction;
import flyweight.Game;

void main() {
    Game game=new Game();
    game.fireBullet(0,0, Direction.UP,"laser.png","black",50,10);
    game.fireBullet(4,6,Direction.DOWN,"rocket.png","red",60,40);
    game.fireBullet(4,6,Direction.DOWN,"rocket.png","red",60,40);
    game.fireBullet(4,6,Direction.DOWN,"rocket.png","red",60,40);
    game.fireBullet(4,6,Direction.DOWN,"rocket.png","red",60,40);


    game.moveAll();
    game.renderAll();
    System.out.println(game.totalBullets());
    System.out.println(game.totalBulletTypes());
}
