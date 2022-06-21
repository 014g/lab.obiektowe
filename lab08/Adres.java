package com.company;

public class Adres {
    String miasto, ulica, kodPocztowy;
    int numerDomu;

    public Adres(String miasto, String ulica, String kodPocztowy, int numerDomu) throws NieprawidlowyAdresException {
        if(miasto==null){
            throw new NieprawidlowyAdresException("Miasto nie może być nullem");
        }else {this.miasto = miasto;}

        if(ulica==null){
            throw new NieprawidlowyAdresException("Ulica nie może być nullem");
        }else{ this.ulica = ulica;}

        if(kodPocztowy==null){
            throw new NieprawidlowyAdresException("Kod pocztowy nie może być nullem");
        }else{this.kodPocztowy = kodPocztowy;}

        if(numerDomu<=0){
            throw new NieprawidlowyAdresException("Numer domu musi być dodatni");}
        else{this.numerDomu = numerDomu;}
    }
}
