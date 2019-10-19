package com.company.dzien1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        int[] tablica = {5,1,3,6,7};

            for (int i=0; i<10; i++){
                try {
                    System.out.println(tablica[i]);
                } catch (ArrayIndexOutOfBoundsException e) {

                }
            }



    }
}
