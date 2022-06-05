package modell;

public class Lada {
    boolean benneVan;
    int ladak[] = new int[3];
    

    public void LadakTartalma(int nyit) {
        for (int i = 0; i < ladak.length; i++) {
            if(nyit==2){
                benneVan=true;
            }else{
                benneVan=false;
            }
        }
    }
    public Lada(int[] ladak) {
        this.ladak = ladak;
        
    }

    public int[] getLadak() {
        return ladak;
    }

    public boolean setBenneVan() {
        return benneVan;
    }

    
    
}
