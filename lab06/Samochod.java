package com.company;

import java.util.Scanner;

public class Samochod {
    String marka, model, nadwozie, kolor;
    double przebieg, rokProdukcji;
    Scanner scanner = new Scanner(System.in);
    public Samochod(String marka, String model, String nadwozie, String kolor, double przebieg, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        if(przebieg<0) {
            this.przebieg = 0;
        } else this.przebieg = przebieg;
        this.rokProdukcji = rokProdukcji;
    }
    public Samochod() {
        System.out.println("Marka samochodu: ");
        this.marka = scanner.nextLine();
        System.out.println("Model samochodu: ");
        this.model = scanner.nextLine();
        System.out.println("Rodzaj nadwozia: ");
        this.nadwozie = scanner.nextLine();
        System.out.println("Kolor samochodu: ");
        this.kolor = scanner.nextLine();
        System.out.println("Przebieg: ");

        do {
            this.przebieg = scanner.nextDouble();
        } while(this.przebieg<0);
        System.out.println("Rok produkcji: ");
        this.rokProdukcji = scanner.nextInt();
    }
    public void opis(){
        System.out.println("Marka samochodu: "+ this.marka+"\nModel: "+this.model+"\nRodzaj nadwozia: "+this.nadwozie+"\nKolor: "+this.kolor+
                "\nPrzebieg: "+this.przebieg+"\nRok produkcji: "+this.rokProdukcji);
    }
}
