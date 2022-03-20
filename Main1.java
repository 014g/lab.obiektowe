package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        /*System.out.println("Podaj swoje imię: ");
        Scanner scanner =new Scanner(System.in);
        String imie = scanner.nextLine();
        System.out.println("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();
        dane(imie, wiek);*/

        /*System.out.println("Podaj dwie liczby: ");
        Scanner in = new Scanner(System.in);
        double x =in.nextDouble();
        double y =in.nextDouble();
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        wyniki(x,y);*/

        /*System.out.println("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("a= " + a);
        // System.out.println(parzysta(a));
        //System.out.println(podzielna(a));
        // System.out.println(potega(a));
        //System.out.println(pierwiastek(a));*/
        /*System.out.println("Podaj trzy liczby: ");
        Scanner in = new Scanner(System.in);
        double x =in.nextDouble();
        double y =in.nextDouble();
        double z =in.nextDouble()
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);
        wyniki(x,y,z);*/
        System.out.println("Podaj przedział ");
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double bok1 = rand.nextDouble() * (b - a) + a;
        double bok2 = rand.nextDouble() * (b - a) + a;
        double bok3 = rand.nextDouble() * (b - a) + a;
        System.out.println("bok1: " +bok1 +" bok2: " +bok2 +" bok3: " +bok3);
        System.out.println(trojkat(bok1, bok2, bok3));


    }

    //1. Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
    public static void dane(String imie, int wiek) {
        System.out.println("Imię: " + imie);
        System.out.println("Wiek: " + wiek);
    }


    //2. Napisz  metodę,  która  jako  argument  przyjmuje  2  liczby  i  wypisuje  ich  sumę,  różnicę  i  iloczyn.
    // Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
    public static void wyniki(double x, double y) {
        double suma = x + y;
        System.out.println("Suma: " + suma);
        double różnica = x - y;
        System.out.println("Różnica: " + różnica);
        double iloczyn = x * y;
        System.out.println("Iloczyn= " + iloczyn);

    }

    //3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
    public static boolean parzysta(double a) {
        if (a % 2 == 0)
            return true;
        else return false;

    }

//4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5.

    public static boolean podzielna(double a) {
        if (a % 3 == 0 && a % 5 == 0)

            return true;
        else return false;
    }

//5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.

    public static double potega(double a) {
        return Math.pow(a, 3);

    }

//6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.

    public static double pierwiastek(double a) {
        return Math.sqrt(a);

    }

//7. Napisz  metodę,  która  jako  argument  przyjmie  trzy  liczby.
// Metoda powinna  zwrócić  true  jeśli z odcinków  o  długości  przekazanych  w  argumentach  można  zbudować  trójkąt  prostokątny.
// Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są przez użytkownika z klawiatury.

    public static boolean trojkat(double bok1, double bok2, double bok3) {
        if (bok1 * bok1 + bok2 * bok2 == bok3 * bok3 || bok1 * bok1 + bok3 * bok3 == bok2 * bok2 || bok2 * bok2 + bok3 * bok3 == bok1 * bok1)
            return true;
        else return false;

    }
}







































