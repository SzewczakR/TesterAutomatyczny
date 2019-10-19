package com.company.dzien2;

public class Samochody {

    public static void main(String[] args) {
        Samochod mojeAuto = new Samochod("Czerwony");
        System.out.println(mojeAuto.getKolor());
    }
}
class Samochod{
    public String kolor;
    public Samochod(){}
    public Samochod(String kolor){
        this.kolor = kolor;
    }

    public void Jedzie(){
        System.out.println("Brum brum brum");
    }

    public String getKolor(){
        return kolor;
    }
}


