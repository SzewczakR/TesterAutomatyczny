package com.company.dzien1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie2b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int licznik42 = 0;
        List<Integer> wynik = new ArrayList<Integer>();

        do{
            wynik.add(scanner.nextInt());
            if (wynik.size() > 1) {
                if ((wynik.get(i-1) != 42) && (wynik.get(i) == 42)){
                    licznik42++;
                }
            }
            i++;
        } while (licznik42 != 3);

        for (int j=0; j<wynik.size();j++)
            System.out.println(wynik.get(j));
    }
}
