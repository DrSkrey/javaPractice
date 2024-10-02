package Personaje;

public class BarraSalud {
    //features---variable declarations
    Personaje personaje;
    public float size;
    public float maxHealthValue;
    public float actualHealth;
    String healthSymbol = "█";
    String lostHealthSymbol = "_";
    String barSymbol = "|";
    static Colors colors = new Colors();
    String color = colors.values.get("Default");

    public BarraSalud(Personaje personaje, String color){
        this.personaje = personaje;
        this.color = colors.values.get(color.toUpperCase());
        this.maxHealthValue = personaje.maxHealth;
        this.actualHealth = personaje.health;
    }

    public void update(){
        this.actualHealth = personaje.health;
    }

    public void pintar(){
        int remainingbars = Math.round(actualHealth / maxHealthValue * size);
        int lostbars = (int)size - remainingbars;

        System.out.println(personaje.name + " Salud: " + 
         personaje.health);

        System.out.println(this.barSymbol + this.color + 
         (healthSymbol.repeat(remainingbars)) +
         (lostHealthSymbol.repeat(lostbars)) + 
         this.color + 
         this.barSymbol
        );
    }

}
