package com.company.dzien2;

import java.util.ArrayList;
import java.util.List;

interface Owoce{
    public int pobierzCene();
    public int pobierzWage();
};

class Pomarancze implements Owoce{
    public int cena;
    public int waga;
    public String kolor;

    public Pomarancze(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }

    public String pobierzKolor() {
        return kolor;
    }
}

class Banany implements Owoce{
    public int cena;
    public int waga;
    public String kolor;

    public Banany(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }

    public String pobierzKolor() {
        return kolor;
    }
}

class Jablka implements Owoce{
    public int cena;
    public int waga;
    public String kolor;

    public Jablka(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }

    public String pobierzKolor() {
        return kolor;
    }
}

public class Owocowo {
    public static void main(String[] args) {
        Pomarancze pom = new Pomarancze(12,5,"Pomarańczowe");
        Banany ban = new Banany(4,2,"Żółte");
        Jablka jab = new Jablka(2,4, "Czerwone");

        Owoce[] owocowaTablica= new Owoce[3];
        owocowaTablica[0] = pom;
        owocowaTablica[1] = ban;
        owocowaTablica[2] = jab;

        int sumaWag =0;
        for (Owoce i : owocowaTablica){
            sumaWag+=i.pobierzWage();
        }
        System.out.println(sumaWag);
    }
}
