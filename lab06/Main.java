package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(2,4);
        Punkt punkt3 = new Punkt(5,6);
        Figura figura1 = new Figura();
        Trojkat trojkat1 = new Trojkat(3,5);
        Prostokat prostokat1 = new Prostokat(3,8);

        punkt2.opis();
        punkt2.przesun(2,4);
        punkt2.opis();

        System.out.println(figura1.opis());
        System.out.println(prostokat1.getPowierzchnia());

        prostokat1.przesun(3,5);
        System.out.println(prostokat1.punkt.x + " "+ prostokat1.punkt.y);
        Kwadrat kwadrat1 = new Kwadrat("czarny", 6);
        System.out.println( kwadrat1.opis());

        System.out.println(figura1.opis());
        System.out.println(prostokat1.opis());
        System.out.println( trojkat1.opis());

    }
}
