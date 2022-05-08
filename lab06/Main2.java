package com.company;


public class Main2 {

    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("BMW","e90","Sedan","Czarny",99000,2005);
        samochod1.opis();

        SamochodOsobowy osobowy = new SamochodOsobowy();
        osobowy.opis();
        Samochod samochod2 = new Samochod();
        samochod2.opis();
    }
}
