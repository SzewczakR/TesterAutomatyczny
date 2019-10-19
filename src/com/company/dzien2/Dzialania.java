package com.company.dzien2;

public class Dzialania {

    public static void main(String[] args) {
        mojeDzialanie d = new mojeDzialanie();
        d.mnozenie(3, 5);
        d.mnozenie(1, 2, 3);
        d.mnozenie(1, 2, 3, 4);

    }
}
    class mojeDzialanie {
        public void mnozenie(int a, int b){
            System.out.println(a+b);
        }
        public void mnozenie(int a, int b, int c){
            System.out.println(a+b+c);
        }
        public void mnozenie(int a, int b, int c, int d){
            System.out.println(a+b+c+d);
        }
    }


