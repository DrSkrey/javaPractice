import Personaje.Personaje;
import java.util.Scanner;

public class txt1 {

    public static void main(String[] args) {
        Personaje heroe = new Personaje("Héroe", 1000F, 100F);
        Personaje enemigo = new Personaje("Enemigo", 500F, 200F);

        Scanner scan = new Scanner(System.in);

        int numRounds = 10;
        int i = 0;
        while (i<numRounds) {
            cleanConsole();
            
            heroe.attack(enemigo);
            enemigo.attack(heroe);
            System.out.println("Salud de " + heroe.name + " " + heroe.health);
            System.out.println("Salud de " + enemigo.name + " " + enemigo.health);
            
            i++;
            scan.nextLine();
        }
        scan.close();
    }

    public static final void cleanConsole() {
        System.out.println("\033c");
    }
    
}
