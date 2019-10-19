package com.company.dzien2;

class Main1 {
    public static void main(String[] args) {

        Szef szef = new Szef();
        szef.imie = "Jan";
        szef.nazwisko = "Kowalski";
        szef.wiek = 33;
        szef.premia = 1000;

    }
}
public class PracownicyFirmy {

    String imie;
    String nazwisko;
    int wiek;

    public PracownicyFirmy(){}
    public PracownicyFirmy(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}

class Szef extends PracownicyFirmy{
    int premia;
}
