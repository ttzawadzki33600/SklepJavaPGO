public class Sklep {
    private Produkt[] produkty;
    private Klient[] klienci;
    private Zamowienie[] zamowienia;
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;


    public Sklep(int maxProdukty, int maxKlienci, int maxZamowienia){
        this.produkty = new Produkt[maxProdukty];
        this.klienci = new Klient[maxKlienci];
        this.zamowienia = new Zamowienie[maxZamowienia];
        this.liczbaProduktow = 0;
        this.liczbaKlientow = 0;
        this.liczbaZamowien = 0;
    }


    public void dodajProdukt(Produkt produkt){
        if(liczbaProduktow < produkty.length){
            produkty[liczbaProduktow++] = produkt;
        }
        else{
            System.out.println("Brak miejsca na nowe produkty!");
        }
    }


    public void dodajKlienta(Klient klient){
        if(liczbaKlientow < klienci.length){
            klienci[liczbaKlientow++] = klient;
        }
        else{
            System.out.println("Brak miejsca na nowych klientów!");
        }
    }



    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        if (liczbaZamowien >= zamowienia.length){
            System.out.println("Brak miejsca na nowe zamówienia!");
            return null;
        }
        if (produkty.length != ilosci.length){
            System.out.println("Nie zgadza się liczba produktów i ilości!");
        }
        else {

            Zamowienie zamowienie = new Zamowienie(liczbaZamowien, klient, produkty, ilosci, "Nowe");
            zamowienia[liczbaZamowien++] = zamowienie;
            return zamowienie;
        }
        return null;

    }

    public void wyswietlProdukty(){
        for(int i = 0; i < liczbaProduktow; i++){
            produkty[i].display();
            System.out.println("-------");
        }
    }

    public void wyswietlKlientow() {
        for(int i = 0; i < liczbaKlientow; i++){
            klienci[i].display();
            System.out.println("-------");
        }
    }



    public void dodajKlienta(Klient[] klienci) {
        this.klienci = klienci;
    }
    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }
    public void setLiczbaProduktow(int liczbaProduktow) {
        this.liczbaProduktow = liczbaProduktow;
    }


}

