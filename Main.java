package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrom(420));
        System.out.println(zad5("kajak"));
    }

    public static double wczytaj() {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        return n;
    }
//1.Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik).
// Wprowadzamy liczbę punktów dla każdego studenta. Napisz program, który obliczy średnią liczbę punktów w grupie z wykorzystaniem pętli while.

    public static void zad1() {
        System.out.println("podaj liczbę studentów: ");
        double liczbaStudentow = wczytaj();
        double suma = 0, srednia = 0, temp = liczbaStudentow;
        while (liczbaStudentow > 0) {
            System.out.println("przypisz pkt studentom: ");
            double d = wczytaj();
            if (d >= 0 && d <= 50) {

                suma = suma + d;
                liczbaStudentow--;
            }
            continue;
        }
        srednia = suma / temp;
        System.out.println("średnia: " + srednia);
    }

    //2.Napisz  program,  który  pozwoli  na  wczytanie  10  liczb  i  wyznaczeniu  ilości  oraz  sumy  liczb ujemnych i dodatnich podanych przez użytkownika.
    public static void zad2() {
        System.out.println("podaj 10 liczb: ");
        double sumaD = 0, sumaU = 0, liczba;
        int ileD = 0, ileU = 0;
        for (int i = 0; i < 10; i++) {
            liczba = wczytaj();
            if (liczba >= 0) {
                ileD++;
                sumaD += liczba;

            } else {
                ileU++;
                sumaU += liczba;
            }
        }
        System.out.println("suma liczb dodatnich: " + sumaD + "\nilość liczb dodatnich: " + ileD);
        System.out.println("suma liczb ujemnych: " + sumaU + "\nilość liczb ujemnych: " + ileU);
    }

    //3.Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy wszystkich liczb parzystych w danym ciągu.
    public static void zad3() {
        System.out.println("podaj ilość wyrazów ciągu: ");
        int wyrazy = (int) wczytaj();
        double suma = 0, liczba;
        for (int i = 0; i < wyrazy; i++) {
            System.out.println("podaj liczbę: ");
            liczba = wczytaj();
            if (liczba % 2 == 0) suma += liczba;
        }
        System.out.println("suma: " + suma);
    }

    //4.Wykorzystując  algorytm  z  zadania  3,
// napisz  program  który  pozwoli  użytkownikowi  na wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym ciągu.
    public static void zad4() {
        Random rand = new Random();
        System.out.println("podaj ilość losowych liczb: ");
        double wyrazy = wczytaj(), sumad = 0;
        int liczba;

        if (wyrazy > 0) {
            for (int i = 0; i < wyrazy; i++) {
                liczba= rand.nextInt(56)-10;
                if (liczba % 2 == 0) sumad += liczba;
            }
            System.out.println("suma liczb dodatnich: " + sumad);
        }
        else System.out.println("wyrazy musi być liczbą dodatnią");
    }
//5.Napisz  program,  który  odpowie  na  pytanie,  czy  podane  przez  użytkownika  słowo  jest palindromem.
// Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.
    public static boolean zad5(String tekst) {
            for (int i=0; i<tekst.length()/2;i++){
                char znak = tekst.charAt(i);
                char przeciwnyZnak = tekst.charAt(tekst.length()-1 -i);

                if(znak !=przeciwnyZnak) return false;
            }
            return true;
        }
        public static boolean Palindrom(long liczba){
            return zad5(Long.toString(liczba));
        }

}



