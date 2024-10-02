package Personaje;
import java.util.HashMap;

public class Colors {
    HashMap <String, String> values = new HashMap<>();
    
    Colors (){
        addColors();
    }
    
    public void addColors(){
        values.put("Red", "\033[91m");
        values.put("Green", "\033[92m");
        values.put("Default", "\033[0m");
    }

}
