package com.company.dzien1;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        System.out.println("Podaj imię:");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();

        switch (imie){
            case "Radek":
                System.out.println("Cześć "+imie);
                break;
            case "Kamil":
                System.out.println("Cześć Kamil");
                break;
            default:
                System.out.println("Nie znamy się");
        }
    }
}
