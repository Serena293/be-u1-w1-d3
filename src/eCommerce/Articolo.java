package eCommerce;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int numArticoli;


    Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int numArticoli){
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numArticoli = numArticoli;
    }
}
