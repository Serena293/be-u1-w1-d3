package EsercizioSim;

public class Chiamata {
    String numeroChiamato;
    double durataChiamata;

    Chiamata(String numeroChiamato, double durataChiamata){
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = durataChiamata;
    }

    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + numeroChiamato + ", Durata: " + durataChiamata + " minuti");
    }
}
