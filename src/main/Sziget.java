package main;

import java.util.Scanner;

public class Sziget {
    private Lada lada;
    private static Scanner sc = new Scanner(System.in);
    int ladak[] = new int[3];
    int nyitott;

    public Sziget() {
        LadaNyitas();
    }
    
    public int LadaNyitas(){
        lada.getLadak();
        System.out.println("Kérlek válassz egy ládát!");

        int nyit;
        do {
            System.out.print("Ezt a ládát nyitom ki: "); 
        nyit = sc.nextInt();
        if(nyit==1){
            
            System.out.println("Megvan a kincs!");
        }else if(nyit==0 || nyit==2){
            System.out.println("Nem itt van a kincs!");
        }else{
            System.out.println("Csak 3 láda van!");
        }
        } while (!(nyit==2));
        return nyit;
    }  
    
    private Lada melyik(int nyit) {
        if(nyit==1){
            nyitott = ladak[0];
        }else if(nyit==2){
            nyitott = ladak[1];
        }else if(nyit == 3){
            nyitott = ladak[2];
        }
        return new Lada(nyitott);
    }
    
    private boolean nyitas(int nyit){
        int i = 0;
        while(i < 3 && !(lada.getLadak()[i] == nyit)){
            i++;
        }
        return i < 3;
    }
}
