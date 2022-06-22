package com.company;

public class Komedia extends Film {
    final String typ = "Komedia";

    public Komedia(String tytul, boolean czyPodobalSie) {
        super(tytul, czyPodobalSie);
    }
    public void info() {
        System.out.println("Typ: " + this.typ);
        super.info();
    }
}
