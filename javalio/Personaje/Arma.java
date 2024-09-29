package Personaje;

public class Arma {
    //features---variable declarations
    public String name;
    public String type;
    public float damage;
    public float value;


    public Arma(String name, String type, float damage, float value){
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.value = value;
    }   

    public static Arma sword = new Arma("Espada de madera","Cuerpo a cuerpo",8F,8F);
    public static Arma bow = new Arma("Arco de madera","Distancia",7F,9F);
    public static Arma mallet = new Arma("Mazo de madera","Cuerpo a cuerpo",10F,9F);

}
