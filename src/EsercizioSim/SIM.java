package EsercizioSim;

public class SIM {
   private String numeroDiTelefono;
   private double credito;
   private String[] ultimeChiamate;
Chiamata chiamata;


SIM(String numeroDiTelefono, double credito){
    this.numeroDiTelefono = numeroDiTelefono;
    this.credito = credito;
}


public  void stampaDatiSim(){
    System.out.println("Numero di Telefono: " + this.numeroDiTelefono + " Credito residuo: " + this.credito);
}
}
