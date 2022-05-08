package com.company;

public class SamochodOsobowy extends Samochod {
    double waga,pojemnosc,iloscOsob;
    public SamochodOsobowy() {
        super();
        System.out.println("Waga samochodu w tonach: ");
        do {
            this.waga = scanner.nextDouble();
        } while(waga < 2 || waga > 4.5);
        System.out.println("Pojemnosc samochodu ( od 0.8 - 3.0) : ");
        do {
            this.pojemnosc = scanner.nextDouble();
        } while(pojemnosc < 0.8 || pojemnosc > 3.0);

        System.out.println("Ilosc dostepnych miejsc: ");
        this.iloscOsob = scanner.nextInt();
    }
    public void opis(){
        super.opis();
        System.out.println("Waga w tonach: "+this.waga+"\nPojemność: "+this.pojemnosc+"\nIlość miejsc: "+iloscOsob);
    }

}
