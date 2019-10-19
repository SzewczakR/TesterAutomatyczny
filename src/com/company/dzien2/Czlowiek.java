package com.company.dzien2;

public class Czlowiek {
    Konczyny konczyny;
    Glowa glowal;
    Tulow tulow;

    public Czlowiek(Konczyny konczyny, Glowa glowal, Tulow tulow) {
        this.konczyny = konczyny;
        this.glowal = glowal;
        this.tulow = tulow;
    }
}

interface IPoruszanie{
    void poruszanie();
}
interface IPuchnie{
    void puchnie();
}

class WspolneCechyCialaCzlowieka{
    int iloscKomorek;
    String kolor;

    public int getIloscKomorek() { return iloscKomorek; }
    public String getKolor() { return kolor; }

    public void setIloscKomorek(int iloscKomorek) { this.iloscKomorek = iloscKomorek; }
    public void setKolor(String kolor) { this.kolor = kolor; }

    public WspolneCechyCialaCzlowieka(int iloscKomorek, String kolor) {
        this.iloscKomorek = iloscKomorek;
        this.kolor = kolor;
    }
}
class Dlugosc extends WspolneCechyCialaCzlowieka{
    int dlugosc;

    public int getDlugosc() { return dlugosc; }
    public void setDlugosc(int dlugosc) { this.dlugosc = dlugosc; }

    public Dlugosc(int iloscKomorek, String kolor, int dlugosc) {
        super(iloscKomorek, kolor);
        this.dlugosc = dlugosc;
    }
}

class Obwod{
    int wartosc;

    public Obwod(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() { return wartosc; }
    public void setWartosc(int wartosc) { this.wartosc = wartosc; }
}

class Konczyny extends Dlugosc implements IPoruszanie{
    String rodzaj;

    public Konczyny(int iloscKomorek, String kolor, int dlugosc, String rodzaj) {
        super(iloscKomorek, kolor, dlugosc);
        this.rodzaj = rodzaj;
    }

    public void Pisanie(){}
    @Override
    public void poruszanie() {
        System.out.println("Kończyny się poruszają");
    }
}
class Glowa extends WspolneCechyCialaCzlowieka implements IPoruszanie,IPuchnie{
    Boolean wlosy;
    Obwod obw;

    public Glowa(int iloscKomorek, String kolor, Boolean wlosy, Obwod obw) {
        super(iloscKomorek, kolor);
        this.wlosy = wlosy;
        this.obw = obw;
    }

    public void Mowienie(){}

    @Override
    public void poruszanie() {
        System.out.println("Głowa się porusza");
    }

    @Override
    public void puchnie() {
        System.out.println("Głowa puchnie");
    }
}
class Tulow extends Dlugosc implements IPuchnie{
    Obwod obw;

    public Tulow(int iloscKomorek, String kolor, int dlugosc, Obwod obw) {
        super(iloscKomorek, kolor, dlugosc);
        this.obw = obw;
    }

    public void Trawienie() {}

    @Override
    public void puchnie() {
        System.out.println("Tułów puchnie");
    }
}

class Main12{
    public static void main(String[] args) {

        Czlowiek czlowiek = new Czlowiek(new Konczyny(200,"zielony",50,"nogi"), new Glowa(540,"czarny", true,new Obwod(46)), new Tulow(678,"biały",150,new Obwod(56)));


    }
}
