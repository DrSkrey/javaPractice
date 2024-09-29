import Personaje.Personaje;

public class txt1 {

    public static void main(String[] args) {
        Personaje heroe = new Personaje("Héroe", 1000F, 100F);
        Personaje enemigo = new Personaje("Enemigo", 500F, 200F);

        int numRounds = 10;
        int i = 0;
        while (i<numRounds) {
            heroe.attack(enemigo);
            enemigo.attack(heroe);
            System.out.println("Salud de " + heroe.name + " " + heroe.health);
            System.out.println("Salud de " + enemigo.name + " " + enemigo.health);
            i++;
        }
    }
    
}
