package Personaje;

public class Enemigo extends Personaje {
    Arma armaDefault;

    public Enemigo (String name, float health){
       super(name, health);
       super.barraSalud = new BarraSalud(this, "yellow");
       this.armaDefault = arma;
    }   

}
