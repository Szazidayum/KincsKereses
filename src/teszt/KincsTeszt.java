package teszt;

import modell.Lada;

public class KincsTeszt {
   private Lada lada;

    public KincsTeszt() {
        System.out.println("Teszteset:");
        tesztKincsHely();
    }
    public static void main(String[] args) {
        new KincsTeszt();
    }
   
    public void tesztKincsHely(){
        System.out.println("Kincs a második ládában van-e?");
        lada = new Lada(new int[]{1,2,3});
        lada.LadakTartalma(2);
        boolean kincs = lada.setBenneVan();
        assert kincs==(true): "nem jó a teszt";
        System.out.println("Jó a teszt");
    }
}
