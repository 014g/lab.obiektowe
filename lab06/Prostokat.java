package com.company;

public class Prostokat extends Figura{
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    public Prostokat(String kolor, double wys, double szer) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public void przesun(float x,float y)
    {
        this.punkt.x+=x;
        this.punkt.y+=y;
    }

    @Override
    String opis() {
        return super.opis();
    }
}

