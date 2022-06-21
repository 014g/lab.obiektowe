package com.company;
import java.security.CodeSigner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	ArrayList listaStarszych = new ArrayList();
        ArrayList listaMlodych = new ArrayList();
        Uczestnik o1 = new Uczestnik(1, 15, "Zuzanna");
        Uczestnik o2 = new Uczestnik(2, 23, "Filip");
        Uczestnik o3 = new Uczestnik(3, 20, "Wiktoria");
        Uczestnik o4 = new Uczestnik(4, 18, "Anna");
        Uczestnik o5 = new Uczestnik(5, 40, "Jan");
        if (o1.wiek < 18)
            listaMlodych.add(o1);
        else listaStarszych.add(o1);
    }
    /*Scanner scanner = new Scanner(System.in);
        int a;
        Uczen[] p = new Uczen[10];
        for (int i=0; i<10; i++) {
            p[i] = new Uczen(a = scanner.nextInt());
        }
        List<Uczen> listaUczniow = new LinkedList<>();
        for (Uczen n : p) {
            listaUczniow.add(n);
        }
        listaUczniow.subList(1,3).clear();
        System.out.println(listaUczniow);*/
}

