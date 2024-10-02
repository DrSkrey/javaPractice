package Personaje;

public class Heroe extends Personaje {
    Arma armaDefault;

    public Heroe (String name, float health){
       super(name, health);
       super.barraSalud = new BarraSalud(this, "red");
       this.armaDefault = arma;
    }   

}
