package EsercizioSim;

public class Chiamata {
    String numeroChiamato;
    double durataChiamata;

    Chiamata(String numeroChiamato, double durataChiamata){
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = durataChiamata;
    }
//per evitare di stampare [null, null, null, null, null]
    public String toString() {
        return "Chiamata{numeroChiamato='" + numeroChiamato + "', durata=" + durataChiamata + "}";
    }
    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + numeroChiamato + ", Durata: " + durataChiamata + " minuti");
    }
}
