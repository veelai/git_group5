//Added scanner 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("kehittaja 1"); 
        Scanner in = new Scanner(System.in);

        Autoradio cradio1 = new Autoradio("Alpine", "Boomblaster9000", false, false);

        cradio1.printInfo();
        cradio1.turnOn();



    }
} // Appin loppu

class Auto {

    // atribuutit

    public String merkki;
    public String malli;
    public int bensanMaara;

    // metidit
    public void jarrutta() {
        System.out.println("Auto jarruttaa");
    }
}
// New class Autoradio // Kehittaja 2 -TK
class Autoradio {

    //Attributes
    boolean isOn;
    String mode;
    String brand;
    String model;

    // Metodit
    
//Muodostimet
    public Autoradio(String m, String b, boolean onoff, boolean d) {
        brand = b;
        model = m;
        isOn = onoff;
        mode = "Default channel 108.00mHz"; 


    }
//toiminnot

public void turnOn() {
    isOn = true;
    System.out.println("¤¤ Turned On ¤¤");
    System.out.println("Alpine radio turning ON...");
}

public void turnOff() {
    isOn = false;
    System.out.println("Radio turning off");

}

public void printInfo() {
    System.out.println("\n¤¤ Auto-Radio information ¤¤");
    System.out.println("Brand:" + brand);
    System.out.println("Model:"+ model);
    if (isOn==true)
    {
        System.out.println("\nRadio is ON");
    }
    else
    {
        System.out.println("\nRadio is OFF");
    }
    System.out.println("Active mode: " + mode);

}

// Valitse "mode" metodi
public void setMode(String newMode) {
    mode = newMode;
System.out.println("Mode changed to: " + mode);
}


}