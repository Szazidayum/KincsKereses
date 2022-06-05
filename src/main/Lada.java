package main;

public class Lada {
    int ladak[] = new int[3];
    boolean benneVan;

    public Lada(int[] ladak, boolean bennevanE) {
        this.ladak = ladak;
        benneVan = false;
    }

    Lada(int nyitott) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String LadakTartalma(int nyitott) {
        
//        int arany = ladak[0];
//        int ezust = ladak[1];
//        int bronz = ladak[2];
        for (int i = 0; i < ladak.length; i++) {
            if(ladak[i]==nyitott){
                benneVan=true;
            }
        }
       return "";
    }
    
//    public String nyitas(int nyit){
//        
//    }

    public int[] getLadak() {
        return ladak;
    }

    public boolean setBenneVan() {
        return benneVan;
    }
    
}
