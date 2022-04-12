package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /*prostokąt figura=new prostokąt(10,5);
        figura.obwod();
        figura.pole();
        figura.przekatna();*/

        /*Budynek budynek=new Budynek("szkoła", LocalDate.parse("2014-10-04"),44);
        budynek.informacja();*/

        Gatunek gatunek=new Gatunek("zwierze","zwierz",19,19,"hcdjuhbsdhx hadesj");
        gatunek.wszystkieDane();

        Gatunek gatunek1= gatunek.copy();
        gatunek1.wszystkieDane();
    }

//Stwórz  program  w  którym  będzie  utworzonych  kilka  obiektów  typu  Gatunek.
// Klasa  Gatunek powinna  zawierać  następujące  pola:  nazwę  rodzaju,  nazwę  gatunkową,
// liczbę  chromosomów  2n, podstawową liczbę chromosomów x, opis oraz metody: podającą pełną
// nazwę (Rodzaj + gatunek), podającą  haploidalną  liczbę  chromosomów  n,  wypisującą  wszystkie
// dane,  klonującą  obiekt  – metoda  powinna  zwracać  odnośnik  do  nowego  obiektu  typu  Gatunek
// o  wartościach  pól  takich samych jak w obiekcie, w którym została wywołana.
// W programie powinny być użyte wszystkie metody.


}