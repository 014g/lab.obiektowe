package com.company;

public class Horror extends Film {
    final String typ = "Horror";

    public Horror(String tytul, boolean czyPodobalSie) {
        super(tytul, czyPodobalSie);
    }
    public void info() {
        System.out.println("Typ: " + this.typ);
        super.info();
    }
}
