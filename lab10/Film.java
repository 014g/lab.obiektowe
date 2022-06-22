package com.company;

public class Film {
    String tytul;
    boolean czyPodobalSie;

    public Film(String tytul, boolean czyPodobalSie) {
        this.tytul = tytul;
        this.czyPodobalSie = czyPodobalSie;
    }
    public String getTytul() {
        return tytul;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public boolean isCzyPodobalSie() {
        return czyPodobalSie;
    }
    public void setCzyPodobalSie(boolean czyPodobalSie) {
        this.czyPodobalSie = czyPodobalSie;
    }
    public void info() {
        System.out.println("Tytuł filmu: " + this.tytul);
        System.out.println("Czy film się podobał?: " + this.czyPodobalSie);

    }
}
