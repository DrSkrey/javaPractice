import Personaje.*;
import java.util.Scanner;

public class txt1 {

    public static void main(String[] args) {
        Heroe heroe = new Heroe("Héroe", 1000F);
        Enemigo enemigo = new Enemigo("Enemigo", 500F);

        Scanner scan = new Scanner(System.in);

        heroe.equipar(Arma.sword);
        enemigo.equipar(Arma.bow);

        int numRounds = 10;
        int i = 0;
        while (i<numRounds) {
            cleanConsole();
            System.out.println("Ronda " + (i + 1));

            heroe.attack(enemigo);
            enemigo.attack(heroe);

            heroe.barraSalud.pintar();
            enemigo.barraSalud.pintar();
            
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
