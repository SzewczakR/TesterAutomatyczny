package com.company.dzien3;

import java.util.Scanner;

public class WzorzecFabryka {

    public static void main(String[] args) {

    Zwierze zwierze = FabrykaZwierzat.getZwierze("Miau");

        System.out.println(zwierze.getClass().toString());
    }
}

interface Zwierze{
    String dajGlos();
}

class Kot implements Zwierze{

    @Override
    public String dajGlos() {
        return "Miau";
    }
}

class Pies implements Zwierze{

    @Override
    public String dajGlos() {
        return "Hau";
    }
}

class Kon implements Zwierze{

    @Override
    public String dajGlos() {
        return "Iha";
    }
}

class FabrykaZwierzat{

    public static Zwierze getZwierze(String glos){
        Zwierze zwierze = null;
        switch (glos){

            case "Miau" :
                zwierze = new Kot();
                break;
            case "Hau":
                zwierze = new Pies();
                break;
            case "Iha":
                zwierze = new Kon();
                break;
        }
        return zwierze;
    }




}