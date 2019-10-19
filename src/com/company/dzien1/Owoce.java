package com.company.dzien1;

import java.util.Scanner;

public class Owoce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaki rodzaj owoców:");
        String owoc = scanner.next();

        System.out.println("Podaj ilość kilogramów:");
        int waga = scanner.nextInt();
        String info = "";
        if (waga>100){
            info = owoc + " - jest za dużo o " + (waga-100) +" kg";
        }else if(waga <100){
            info = owoc + " - jest jeszcze " + (100 - waga) +" kg miejsca";
        }

        switch (owoc){
            case "jabłka":
                System.out.println(info);
                break;
            case "banany":
                System.out.println(info);
                break;
            case "pomarańcze":
                System.out.println(info);
                break;
            default:
                System.out.println("Błędne dane");
        }
    }
}
