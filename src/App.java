//Added scanner 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("kehittaja 1"); 
        System.out.println("kehittaja 2/ autoradio"); 
        Scanner in = new Scanner(System.in);

        Autoradio cradio1 = new Autoradio("Boomblaster-9000", "Alpine", false, false);

        cradio1.printInfo();
        cradio1.turnOn();
         // Valitse mode(stations) 1-3
        while (true) {
            System.out.println("\nChoose radio station:");
            System.out.println("\nPreset one (EDM) is 1.");
            System.out.println("\nPreset two (Metal) is 2.");
            System.out.println("\nPreset three (Jazz) is 3.");
            System.out.println("\nEnter number 4. to Exit station selection and turn off the radio.");
            System.out.print("\nSelect option: ");

            String choice = in.nextLine();

            switch (choice) {
                case "1":
                cradio1.setMode("******----> Preset station(EDM) 1 selected. <----******");
                break;
                case "2":
                cradio1.setMode("***********----> Preset station(Metal) 2 selected. <----***********");
                break;
                case "3":
                cradio1.setMode("*****************----> Preset station(Jazz) 3 selected. <----*****************");
                break;
                case "4":
                System.out.println("Exit radio selected...Turning radio OFF.");
                in.close();
                return;
                default:
                System.out.println("¤¤ PLEASE CHOOSE YOUR STATION ¤¤");
            }
            
            cradio1.printInfo();


        }



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


//Muodostimet
    public Autoradio(String m, String b, boolean onoff, boolean d) {
        brand = b;
        model = m;
        isOn = onoff;
        mode = "Default channel 108.00mHz"; 


    }
//toiminnot // radio käynnistyy defaulttina

public void turnOn() {
    isOn = true;
    System.out.println("Alpine radio turning ON...");
    System.out.println("¤¤ Radio turned ON ¤¤");
}

public void turnOff() {
    isOn = false;
    System.out.println("Radio turning off");

}

public void printInfo() {
    System.out.println("\n¤¤ Auto-Radio information ¤¤");
    System.out.println("Brand: " + brand);
    System.out.println("Model: "+ model);
    if (isOn==true)
    {
        System.out.println("\nRadio is ON");
    }
    else
    {
        System.out.println("\nRadio is OFF");
    }
    System.out.println("ACTIVE MODE: " + mode);

}


// Valitse "mode" metodi
public void setMode(String newMode) {
    mode = newMode;
System.out.println("Mode changed to: " + mode);
}


} //Autoradio luokan loppu