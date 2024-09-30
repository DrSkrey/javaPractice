public class Personaje {
    //features---variable declarations
    public String name;
    public float health;
    public float maxHealth;
    Arma arma;

    public Personaje(String name, float health){
        this.name = name;
        this.health = health;
        this.arma = Arma.fists;
    }

    public void attack(Personaje objetivo){
        objetivo.health -= this.arma.damage;
        objetivo.health = Math.max(objetivo.health, 0);
        System.out.println(this.name + " hizo " +
         this.arma.damage + " de daño a " + objetivo.name);

    }

    public void equipar(Arma arma){
        this.arma = arma;
        System.out.println(this.name + "equipó " +
         this.arma.name);
    }

    public void soltar(){
        if (this.arma.equals(Arma.fists)) {
            System.out.println("No pueden ser desequipados");
        }   else {
            System.out.println(this.name + " soltó " + this.arma.name);
            this.arma = Arma.fists;
        }
    }

    public void heal(){

    }

}
