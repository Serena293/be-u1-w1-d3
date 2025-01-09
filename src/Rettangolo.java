public class Rettangolo {

    private double base;
    private double altezza;


    Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

public  double calcolaPerimetro(){
    return 2*base + 2*altezza;
}

public  double calcolaArea(){
        return  base * altezza;
}

public  void stampaRettangolo(){
        double perimetro = calcolaPerimetro();
        double area = calcolaArea();
    System.out.println(perimetro);
    System.out.println(area);
}

public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
double perimetro1 = r1.calcolaPerimetro();
double area1 = r1.calcolaArea();
double perimetro2 = r2.calcolaPerimetro();
double area2 = r2.calcolaArea();

double sommaPerimetro = perimetro1 + perimetro2;
double sommaArea = area1 + area2;

    System.out.println("Area1 + area2: " + sommaArea);
    System.out.println("Perimetro1 + Perimetro2: " + sommaPerimetro);
}
}
