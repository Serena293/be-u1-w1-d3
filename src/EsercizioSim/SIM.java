package EsercizioSim;

import java.util.Arrays;

public class SIM {

   private String numeroDiTelefono;
   private double credito;
   private Chiamata[] ultimeChiamate;


    // Costruttore per inizializzare il numero di telefono e il credito
SIM(String numeroDiTelefono, double credito){
    this.numeroDiTelefono = numeroDiTelefono;
    this.credito = credito;
}

    SIM(String numeroDiTelefono, double credito, Chiamata[] ultimeChiamate){
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = credito;
        this.ultimeChiamate = Arrays.copyOf(ultimeChiamate, 5);
    }

public  void stampaDatiSim(){
    System.out.println("Numero di Telefono: " + this.numeroDiTelefono + " Credito residuo: " + this.credito);
}

public  void stampaDettagliCompleti(){
    System.out.println("Numero di Telefono: " + this.numeroDiTelefono + " Credito residuo: " + this.credito + " Ultime chiamate: " + Arrays.toString(this.ultimeChiamate));
}
}
