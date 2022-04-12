package com.company;

public class prostokąt {
    double szerokosc;
    double dlugosc;
    public prostokąt(double szerokosc, double dlugosc) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;

    }
     void pole(){
         System.out.println("pole: "+(dlugosc*szerokosc));
    }
    void obwod(){
        System.out.println("obwod: "+(2*dlugosc+2*szerokosc));
    }
    void przekatna(){
        System.out.println("przekatna: "+(Math.sqrt(dlugosc*dlugosc+szerokosc*szerokosc)));
    }

}
