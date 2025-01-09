package EsercizioSim;

public class MainSim {
    public static void main(String[] args){
SIM sim1 = new SIM("+39 351 11 11 111", 7.99);
sim1.stampaDatiSim();



Chiamata chiamata1 = new Chiamata("+33 222 222 22 2", 10.0);
Chiamata chiamata2 = new Chiamata("+33 222 222 55 2", 9.0);
Chiamata chiamata3 = new Chiamata("+33 772 222 22 2", 11.0);
Chiamata chiamata4 = new Chiamata("+33 222 222 22 2", 20.0);
Chiamata chiamata5 = new Chiamata("+33 222 999 22 2", 30.0);

Chiamata[] chiamataArray = {chiamata1, chiamata2, chiamata3, chiamata4, chiamata5};
        SIM sim2 = new SIM("+44 77 555 66 22", 10.99, chiamataArray );
        sim2.stampaDettagliCompleti();
    };

}
