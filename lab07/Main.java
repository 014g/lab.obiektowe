package com.company;

public class Main {
    public static void main(String[] args) {
        Samolot s1 = new Samolot();
        s1.lec();

        Statek statek = new Statek();
        statek.plynie();

        Wieloryb ryba = new Wieloryb();
        ryba.plyn();
        ryba.lec();
        ryba.wynurz();
        ryba.zanurz();
    }
    }

