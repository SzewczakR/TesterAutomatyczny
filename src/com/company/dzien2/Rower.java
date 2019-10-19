package com.company.dzien2;

    interface Pojazd{
        public void start();
        public void stop();

    }

    abstract class PojazdKolowy implements Pojazd{
        public void stop(){
            System.out.println("musisz sie zatrzymać");
        }
    }

    public class Rower extends PojazdKolowy {

        @Override
        public void start() {

        }

        public void skok() {

        }
    }

    class Hulajnoga implements Pojazd{

        @Override
        public void start() {

        }

        @Override
        public void stop() {

        }
    }
