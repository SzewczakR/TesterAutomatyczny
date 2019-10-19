package com.company.dzien3;

public class Zadanie1 {

    public static void main(String[] args) {

        Samochod autko = FabrykaSamochodow.getSamochod(220);
        System.out.println("TTTTTTT");
        System.out.println(autko.getClass());
        System.out.println(autko.maxPredkosc());

    }
}

interface Samochod{
    int maxPredkosc();
}

class Mercedes implements Samochod{
    int cena;
    int maxPredkosc = 180;
    String kolor;

    @Override
    public int maxPredkosc() {
        return this.maxPredkosc;
    }
}

class BMW implements Samochod{
    int cena;
    int maxPredkosc = 250;
    String kolor;

    @Override
    public int maxPredkosc() {
        return this.maxPredkosc;
    }
}

class Audi implements Samochod{
    int cena;
    int maxPredkosc = 220;
    String kolor;

    @Override
    public int maxPredkosc() {
        return this.maxPredkosc;
    }
}

class FabrykaSamochodow{

    public static Samochod getSamochod(int maxPredkosc){
        Samochod samochod = null;
        switch (maxPredkosc){

            case 180 :
                samochod = new Mercedes();
                break;
            case 250:
                samochod = new BMW();
                break;
            case 220:
                samochod = new Audi();
                break;
        }
        return samochod;
    }

}