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
        lada = melyik();
        
        System.out.println("Kérlek válassz egy ládát!");
        
        int nyit;
        do {
            System.out.print("Ezt a ládát nyitom ki: "); 
        nyit = sc.nextInt();
        if(keres(nyit)){
            
            System.out.println("Megvan a kincs!");
        }else if(nyit==0 || nyit==2){
            System.out.println("Nem itt van a kincs!");
        }else{
            System.out.println("Csak 3 láda van!");
        }
        } while (!(nyit==2));
        return nyit;
    }  
    
    private Lada melyik() {
        int arany = ladak[0];
        int ezust = ladak[1];
        int bronz = ladak[2];
        return new Lada(ladak);
    }
    
    private boolean keres(int nyit){
        int i = 0;
        while(i < 3 && !(lada.getLadak()[i] == nyit)){
            i++;
        }
        return i < 3;
    }
//        (lada.getLadak()[i] == nyit)){

    

}
