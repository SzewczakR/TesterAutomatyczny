package com.company.dzien2;

public class Rodzina {
    public static void main(String[] args) {

        Dzieci dziecko1 = new Dzieci();
        dziecko1.nazwisko = "ttt";
        dziecko1.zabawki = "sfg";
        dziecko1.zeby = true;

        Dzieci dziecko2 = new Dzieci("Szewczak",true,"Samochodzik");

    }
}

class Dziadkowie{
    String nazwisko;

    public Dziadkowie() {}
    public Dziadkowie(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
class Rodzice extends Dziadkowie{
    Boolean zeby;

    public Rodzice() {}
    public Rodzice(String nazwisko, Boolean zeby){
        super(nazwisko);
        this.zeby = zeby;
    }
}
class Dzieci extends Rodzice{
    String zabawki;

    public Dzieci() {}
    public Dzieci(String nazwisko, Boolean zeby, String zabawki) {
        super(nazwisko, zeby);
        this.zabawki = zabawki;
    }
}
