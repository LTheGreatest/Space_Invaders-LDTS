package SpaceInvaders.source_code.Model.Game;

import SpaceInvaders.source_code.Model.Game.Collectables.Collectable;
import SpaceInvaders.source_code.Model.Game.RegularGameElements.*;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private int width;

    private int height;

    private Ship ship;

    private List<Alien> aliens;

    private List<Wall> walls;

    private List<CoverWall> coverWalls;

    private List<Projectile> projectiles;


    private AlienShip alienShip;

    private Collectable collectable;

    private int score;


    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
        this.score = 0;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight(){
        return height;
    }
    public int getScore(){
        return score;
    }

    public void increaseScore(int score){this.score+=score;}

    public Ship getShip() {
        return ship;
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public List<CoverWall> getCoverWalls() {
        return coverWalls;
    }

    public List<Projectile> getProjectiles() {return projectiles;}

    public AlienShip getAlienShip() {return alienShip;}

    public Collectable getCollectable() {
        return collectable;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setAliens(List<Alien> aliens) {
        this.aliens = aliens;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public void setCoverWalls(List<CoverWall> coverWalls) {
        this.coverWalls = coverWalls;
    }

    public void setProjectiles(List<Projectile> projectiles) {this.projectiles = projectiles;}

    public void setAlienShip(AlienShip alienShip) {this.alienShip = alienShip;}

    public void setCollectable(Collectable collectable) {
        this.collectable = collectable;
    }

    public List<Alien> getAttackingAliens(){
        List<Alien> attackingAliens = new ArrayList<>();
        for(Alien alien : aliens){
            if(alien.getAlienState() == AlienState.ATTACKING){
                attackingAliens.add(alien);
            }
        }
        return attackingAliens;
    }

}
