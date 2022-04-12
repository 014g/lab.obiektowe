package com.company;

public class Gatunek {
    String nazwaRodzaju;
    String nazwaGatunkowa;
    int liczbaChromosomow;
    int podstLiczbaChromosomow;
    String opis;

    public Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow, int podstLiczbaChromosomow, String opis) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.liczbaChromosomow = liczbaChromosomow;
        this.podstLiczbaChromosomow = podstLiczbaChromosomow;
        this.opis = opis;
    }
    void pelnaNazwa(){
        System.out.println("Rodzaj+Gatunek: "+nazwaRodzaju+nazwaGatunkowa);
    }
    void haploidalnaLiczbaChr(){
        System.out.println("Haploidalna liczba chromosomów: "+liczbaChromosomow);
    }
    void wszystkieDane(){
        System.out.println("Rodzaj+Gatunek: "+nazwaRodzaju+" "+nazwaGatunkowa+"\nHaploidalna liczba chromosomów: "+liczbaChromosomow+"\nPodstawowa liczba chr: "+podstLiczbaChromosomow+"\nOpis: "+opis);
    }
    public Gatunek copy(){
        return this;

    }
}
