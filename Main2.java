package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        /*System.out.println("Podaj współczynnik a: ");
        Scanner in =new Scanner(System.in);
        double a=in.nextDouble();
        System.out.println("Podaj współczynnik b: ");
        double b=in.nextDouble();
        System.out.println("Podaj współczynnik c: ");
        double c=in.nextDouble();
        fKwadratowa(a, b, c);*/

        //System.out.println(a(3));

        /*double a=9, b=3, c=-1;
        porzadkowanie(a, b, c);*/

        /*boolean warunek1, warunek2;
        System.out.println("Czy obecnie pada deszcz? true/false");
        Scanner in = new Scanner(System.in);
        warunek1 = in.nextBoolean();
        System.out.println("Czy autobus jest na przystanku? true/false");
        warunek2 = in.nextBoolean();
        warunki(warunek1, warunek2);*/

        boolean znizka, premia;
        System.out.println("Czy jest znizka? true/false");
        Scanner in = new Scanner(System.in);
        znizka = in.nextBoolean();
        System.out.println("Czy otrzymales premie? true/false");
        premia = in.nextBoolean();
        warunkii(znizka, premia);

        /*System.out.println("podaj dzialanie jakie chcesz wykonac 1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie, 5-resza z dzielenia");  //zad6
        Scanner in= new Scanner(System.in);
        int opcja= in.nextInt();
        System.out.println("podaj kolejno dwie liczby: ");
        double a=in.nextDouble();
        double b=in.nextDouble();
        dzialania(a,b,opcja);*/

    }


//1.Napisz metodę określania oraz rozwiązywania równania kwadratowego ax2+bx+c=0, gdzie a, b i c są dowolnymi stałymi podawanymi przez użytkownika.
    /*public static void fKwadratowa(double a, double b, double c) {
        if (a != 0) {
            double delta = b * b - 4 * a * c;
            double pierwiastekzDelty = Math.sqrt(delta);
            if (delta < 0) {
                System.out.println("brak rozwiązań");
            }
            if (delta == 0) {
                System.out.println("jedno rozwiązanie \nx0: " + (-b / 2 * a));
            }
            if (delta > 0) {
                System.out.println("dwa rozwiązania");
                System.out.println("x1: " + ((-b + pierwiastekzDelty) / (2 * a)) + "\nx2: " + ((-b - pierwiastekzDelty) / (2 * a)));
            }

        } else {
            System.out.println("błąd-funkcja liniowa (a=0)");
        }*/

//2.Napisz metody wyznaczania wartości funkcji określonych wzorami dla argumentów rzeczywistych podawanych przez użytkownika
    public static double a(double x) {
        if (x > 0) return 2 * x;
        else if (x == 0) return 0;
        else return -3 * x;
    }

    public static double b(double x) {
        if (x >= 1) return x * x;
        else return x;
    }

    public static double c(double x) {
        if (x > 2) return 2 + x;
        else if (x == 2) return 8;
        else return x - 4;
    }

//3.Napisz metodę porządkowania trzech liczb x, y i z. Od najmniejszej do największej.
    public static void porzadkowanie(double a, double b, double c) {
        if (a >= b && a >= c && b >= c) System.out.println(c + " " + b + " " + a);
        else if (a >= b && a >= c && b <= c) System.out.println(b + " " + c + " " + a);
        else if (a <= b && a <= c && b <= c) System.out.println(a + " " + b + " " + c);
        else if (a <= b && a <= c && b >= c) System.out.println(a + " " + c + " " + b);
        else if (a >= b && a <= c && b <= c) System.out.println(b + " " + a + " " + c);
        else if (a <= b && b >= c && b >= c) System.out.println(c + " " + a + " " + b);

    }

//4.Z wykorzystaniem operatorów logicznych ! (negacja), && (and) napisz metodę, która w zależności od spełnienia pewnych
// warunków wyświetla odpowiednie komunikaty:
//      Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”;
//      Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”;
//      Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”, „Miłego dnia i pięknej pogody”.

    public static void warunki(boolean warunek1, boolean warunek2) {
        if (warunek1 && warunek2) System.out.println("Weź parasol, dostaniesz się na uczelnię");
        else if (warunek1 && !warunek2) System.out.println("Nie dostaniesz się na uczelnię");
        else if (!warunek1 && warunek2) System.out.println("Dostaniesz się na uczelnię, miłego dnia i pięknej pogody");
    }
//5.Z wykorzystaniem operatorów logicznych ! (negacja), || (or) napisz metodę, który w zależnościod spełnienia pewnych warunków
// wyświetla odpowiednie komunikaty:
//      Jeśli nie ma zniżki na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”,„Zniżki na samochód nie ma”;
//      Jeśli nie ma zniżki na samochód lub nie otrzymałeś premii, to „Zakup samochód trzeba odłożyć na później...”, „Zniżki na samochód nie ma”;
//      Jeśli jest zniżka na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”.
// Użytkownik podaje informacje o tym czy jest zniżka na samochód i czy otrzymałeś podwyżkę.

     public static void warunkii(boolean znizka, boolean premia){
        if(!znizka || premia) System.out.println("Możesz kupić samochód!"+ "Zniżki na samochód nie ma");
        else if(!znizka || !premia) System.out.println("Zakup samochód trzeba odłożyć na później..."+ "Zniżki na samochód nie ma");
        else if (znizka || premia) System.out.println("Możesz kupić samochód!");
    }

//6.Napisz program który w zależności od wyboru użytkownika pozwoli na wykonywanie działań dodawania, odejmowania, iloczynu, ilorazu i reszty z dzielenia.
    public static void dzialania(double a, double b, int opcja){
    switch (opcja) {
        case 1 -> System.out.println(a + "+" + b + "=" + (a+b));
        case 2 -> System.out.println(a + "-" + b + "=" + (a-b));
        case 3 -> System.out.println(a + "*" + b + "=" + (a*b));
        case 4 -> System.out.println(a + "/" + b + "=" + (a/b));
        case 5 -> System.out.println(a + "%" + b + "=" + (a%b));
        default -> System.out.println("nie ma takiej operacji");
    }
}

}
