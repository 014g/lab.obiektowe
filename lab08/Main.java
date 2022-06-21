package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NieprawidlowyAdresException {
        /*Scanner scanner = new Scanner(System.in);
       try {
           double a = scanner.nextDouble();
           if (a<0){
               throw new IllegalArgumentException("Liczba musi być nieujemna");
               }
           else{
               System.out.println(Math.sqrt(a));
               }
            }
       catch (InputMismatchException e){
         System.err.println("Musisz podać liczbę");
            }
        try{
            System.out.println(silnia(6));
            }
        catch (BlednaWartoscDlaSilniException e){
            System.out.println(e.getMessage());
            }*/
        try{
            Adres adres = new Adres(null,"Sezamkowa","05-077",1);
            }
        catch (NieprawidlowyAdresException e){
            System.err.println(e.getMessage());
        }
    }
    public static int silnia(int a) throws BlednaWartoscDlaSilniException{
        if(a<0){
            throw new BlednaWartoscDlaSilniException("Liczba nie moze byc ujemna");
            }
        int wynik=1;
        for(int i=1; i<=a; i++){
            wynik=wynik*a;
            } return wynik;
    }
}

