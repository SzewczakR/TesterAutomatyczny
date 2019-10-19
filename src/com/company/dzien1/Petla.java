package com.company.dzien1;

import java.util.Scanner;

public class Petla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int licznik = scanner.nextInt();
        if (licznik>=0) {
            do {
                System.out.println("Bomba wybuchnie za "+licznik+" sekund!");
                licznik--;
            } while (licznik >= 0);

        } else {
            System.out.println("Zła liczba");
        }
    }
}
