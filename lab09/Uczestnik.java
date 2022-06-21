package com.company;
import java.util.ArrayList;
import java.util.Objects;

public class Uczestnik {
    int ID, wiek;
    String imie;

    public Uczestnik(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }
    @Override
    public String toString() {
        return "Uczestnik{" + "ID=" + ID + ", wiek=" + wiek + ", imie='" + imie + '\'' + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uczestnik that = (Uczestnik) o;
        return ID == that.ID && wiek == that.wiek && Objects.equals(imie, that.imie);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}
