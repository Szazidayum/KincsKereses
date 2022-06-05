package modell;

import modell.Lada;
import java.util.Scanner;

public class Sziget {
    private Lada lada;
    private static Scanner sc = new Scanner(System.in);
    
    int nyitott;

    public Sziget() {

        LadaNyitas();
    }
    
    public int LadaNyitas(){
        int nyit;
        lada = new Lada(new int[]{1,2,3});
        System.out.println("Kérlek válassz egy ládát!");
        System.out.println("Arany láda: 'Én rejtem a kincset.'");
        System.out.println("Ezüst láda: 'Nem én rejtem a kincset.'");
        System.out.println("Ezüst láda: 'Az arany hazudik.'");
        do {     
        System.out.print("Ezt a ládát nyitom ki: ");
        nyit = sc.nextInt();
        lada.LadakTartalma(nyit);
        if(nyit==2){
            System.out.println("Megvan a kincs!");
        }else if(nyit==1 || nyit==3){
            System.out.println("Nem itt van a kincs!");
        }else{
            System.out.println("Csak 3 láda van!");
        }
        } while (!(nyit==2));
        return nyit;
    }  

    

}
