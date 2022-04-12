package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    LocalDate rokBudowy;
    int liczbaPieter;

    public Budynek(String nazwa, LocalDate rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }
    public long ileLat(){
       LocalDate dzis=LocalDate.now();
       Long iloscLat= ChronoUnit.YEARS.between(rokBudowy,dzis);
       return iloscLat;


    }
    public void informacja(){
        System.out.println("nazwa budynku: "+nazwa+"\nRok budowy: "+rokBudowy+"\nLiczba pięter:" +liczbaPieter+"\nWiek budynku w latach: "+ileLat());
    }
}
