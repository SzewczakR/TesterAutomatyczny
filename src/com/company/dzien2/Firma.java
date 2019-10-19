package com.company.dzien2;

public class Firma {

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        pracownik1.imie = "Radek";
        pracownik1.nazwisko = "Szewczak";
        pracownik1.wiek = 32;

        Pracownik pracownik2 = new Pracownik("Kamil", "Kowal", 25);

        pracownik1.pobierzDane();
        pracownik2.pobierzDane();

        Pracownik pracownik3 = new Pracownik();
        pracownik3.ustawDane("Mikołaj","Mazurek",50);
        pracownik3.pobierzDane();
    }
}

class Pracownik{
    public String imie;
    public String nazwisko;
    public Integer wiek;

    public Pracownik(){};
    public Pracownik(String imie, String nazwisko, Integer wiek){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }

    public String getImie() {return imie; }
    public String getNazwisko(){
        return nazwisko;
    }
    public Integer getWiek(){
        return wiek;
    }
    public void ustawDane(String i, String n, Integer w){
        imie = i;
        nazwisko = n;
        wiek = w;
    }
    public void pobierzDane(){
        System.out.println("Pracownik nazywa się "+ getImie() +" "+getNazwisko()+" i ma "+getWiek() + " lat.");
    }
}