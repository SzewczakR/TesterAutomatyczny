package com.company.dzien1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = {42, 42, 12, 13, 42, 11, 42, 43, 42, 66, 77, 42, 88};
        int licznik = 0;
        int koniec = 0;
        for (int i = 1; i < tablica.length - 1; i++) {
            if ((tablica[i - 1] != 42) && (tablica[i] == 42) && (licznik != 3)) {
                licznik++;
            } else if (licznik == 3) {
                koniec = i;
                break;
            }
        }
        for (int j=0; j<koniec; j++){
            System.out.println(tablica[j]);
        }
    }
}
