import Personaje.Personaje;

public class txt1 {

    public static void main(String[] args) {
        Personaje heroe = new Personaje("heroe", 1000F, 100F);
        Personaje enemigo = new Personaje("enemigo", 500F, 200F);

        heroe.attack(enemigo);
    }
    
}
