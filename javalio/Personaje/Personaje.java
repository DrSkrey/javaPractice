package Personaje;

public class Personaje {
    //features---variable declarations
    protected String name;
    protected float health;
    protected float damage;

    public Personaje(String name, float health, float damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(Personaje objetivo){
        objetivo.health -= this.damage;
        System.out.println(this.name + " hizo " + this.damage + " de daño a " + objetivo.name);

    }

    public void heal(){

    }

}
