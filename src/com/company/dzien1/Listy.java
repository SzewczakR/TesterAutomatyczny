package com.company.dzien1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] tablica= new int[100];

        for(int i : tablica){
            if ((i % 2)==0) {
                tablica[i] = i * 2;
            }
        }

        for(int j=0; j<100;j++){
            System.out.println(tablica[j]);
        }

    }
}
