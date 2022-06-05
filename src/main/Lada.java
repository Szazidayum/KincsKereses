package main;

public class Lada {
    int[] ladak;
    boolean benneVan;

    public Lada(int[] ladak) {
        this.ladak = ladak;
        benneVan = false;
    }

    public String LadakTartalma(int nyit) {
        String uzenet = "";
        for (int i = 0; i < ladak.length; i++) {
            if(nyit==2){
                uzenet = "kincs";
                benneVan=true;
            }else{
                uzenet = "nincs kincs";
            }
        }
       return uzenet;
    }
    

    public int[] getLadak() {
        return ladak;
    }

    public boolean setBenneVan() {
        return benneVan;
    }
    
}
