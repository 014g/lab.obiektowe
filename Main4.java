package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        zad3();
    }


//1.Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each

    public static void zad1() {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj ilość elementów tablicy: ");
        int w = in.nextInt();
        int tab[] = new int[w];
        int suma = 0, srednia = 0;
        System.out.println("podaj elementy: ");
        /*for (int i=0; i<w; i++){
            tab [i]=in.nextInt();
            suma+=tab[i]; */
        for (int i : tab) {
            i = in.nextInt();
            suma += i;
        }
        srednia = suma / w;
        System.out.println("suma: " + suma + "\nśrednia: " + srednia);
    }
//2.Napisz  program,  w  którym  zostanie  utworzona  20-elementowa   tablica   typu   boolean.
// Komórkom o indeksie parzystym przypisz wartości true, a o indeksie nieparzystym –false (zero możesz uznać za wartość parzystą).
// Zawartość tablicy wyświetl na ekranie.

    public static void zad2() {
        boolean tab[] = new boolean[20];
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                tab[i] = true;
            } else {
                tab[i] = false;
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Wartosci tablicy: " + tab[i]);
        }

    }
//3.Napisz program obliczającywariancję dla zestawu liczb, które mogą być np. pomiarami.
// Stwórz tablicę 1-wymiarową, wypełnioną liczbami typu double.Oblicz i wydrukuj wariancję dla tego zestawu liczb.
// Wzór na wariancję wygląda tak:()221isxxsN−=−2s-wariancja, ix-kolejny pomiar, sx-średnia z pomiarów, N-liczba pomiarów.
// Wskazówka:Kolejne pomiary, to kolejne liczby w naszej tablicy.Potrzebna będzie najpierw średnia z pomiarów, a do jej policzenia musimy mieć sumę wszystkich elementów.
// Można to zrobić przy użyciu pętli iterującej po tablicy. Sumę dzielimy przez liczbę elementów w tablicy, otrzymując średnią.
// Kolejnym krokiem jest obliczenie sumykwadratów różnicy xi-xs. Ponieważ w kolejnym etapie należyodejmować średnią od kolejnych pomiarów, ponownie należy zastosowaćpętlę.
public static void zad3(){
    Scanner in = new Scanner(System.in);
    System.out.println("podaj ilość liczb: ");
    int lp = in.nextInt();
    double tab[] = new double[lp];
    double suma = 0;
    System.out.println("Podaj kolejno liczby: ");
    for (int i = 0; i < lp; i++) {
        tab[i] = in.nextDouble();
        suma = suma + tab[i];
    }
    double srednia = 0;
    srednia = suma / lp;
    double szereg = 0;
    for (int i = 0; i < lp; i++) {
        szereg = szereg + Math.pow((tab[i] - srednia),2);
    }
    double wynik = szereg / (lp - 1);
    System.out.println("Wariancja podanego zestawu liczb wynosi " + wynik);
}

}
