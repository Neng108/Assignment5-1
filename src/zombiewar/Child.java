package zombiewar;

public class Child {
    private int health;
    private int attack;
    private String type;
    private boolean alive;
    
    private Child(){
        health = 30;
        attack = 5;
        type = "zombie";
        alive = true;
    }
    public int getHealth(){
        return health;
    }
    public int getAttack(){
        return attack;
    }
    public String getType(){
        return type;
    }
    public boolean getAlive(){
        return alive;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public void setAttack(String type){
        this.type = type;
    }
    public void setAlive(boolean alive){
        this.alive = alive;
    }
}
