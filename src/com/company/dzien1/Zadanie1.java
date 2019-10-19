package com.company.dzien1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wynik = new ArrayList<Integer>();

        System.out.println("Podaj ilość testów:");
            int liczbaTestow = getLiczby(scanner);

            for (int i = 0; i < liczbaTestow; i++) {
                int suma = 0;
                System.out.println("Podaj ile liczb");
                int ileLiczb = getLiczby(scanner);
                for (int j = 0; j < ileLiczb; j++) {
                    suma += getLiczby(scanner);
                }
                wynik.add(suma);
            }
        System.out.println("Output:");
        for (int k = 0; k < wynik.size(); k++) {
            System.out.println(wynik.get(k));
        }
    }

    private static int getLiczby(Scanner scanner) {
        int rrr = 0;
        try {
            rrr = scanner.nextInt();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return rrr;
    }

}
