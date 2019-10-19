package com.company.dzien1;

import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] tablica = new int[2][3];
        int nnn = 0;
        for (int i = 0; i < tablica.length; i++){
            for (int j=0; j < tablica[i].length; j++){
                tablica[i][j] = nnn;
                nnn++;
            }
        }

        for (int i = 0; i < tablica.length; i++){
            for (int j=0; j < tablica[i].length; j++){
                System.out.println("tab["+i+","+j+"] = "+tablica[i][j]);

            }
        }
    }
}
