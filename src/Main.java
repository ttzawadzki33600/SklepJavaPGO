public class Main {
    public static void main(String[] args) {

        Sklep sklep = new Sklep (10, 10, 10);

        Produkt produkt1 = new Produkt(0, "Produkt1", 23, "Kategoria1", 23);
        Produkt produkt2 = new Produkt(1, "Produkt2", 6.99,"Kategoria2",  14);
        Produkt produkt3 = new Produkt(2, "Produkt3", 3.99,"Kategoria3",  6);

        produkt1.display();
        System.out.println(produkt2.getID());

        sklep.dodajProdukt(produkt1);
        sklep.dodajProdukt(produkt2);
        sklep.dodajProdukt(produkt3);


        Klient klient1 = new Klient(0, "Marek", "Wolas", "marekwolas@wp.pl");
        Klient klient2 = new Klient(1, "Bartosz", "Rubin", "bartoszrubin@wp.pl");

        klient1.setCzyStaly(true);

        sklep.dodajKlienta(klient1);
        sklep.dodajKlienta(klient2);

        klient1.display();
        klient2.display();

        Produkt[] produktyZamowienie = {produkt1, produkt2};
        int[] ilosci = {2,3};

        Zamowienie zamowienie = sklep.utworzZamowienie(klient1, produktyZamowienie, ilosci);
        if (zamowienie != null) {
            zamowienie.display();
        }

        System.out.println("Lista produktów w sklepie: ");
        sklep.wyswietlProdukty();
        System.out.println("Lista klientów w sklepie: ");
        sklep.wyswietlKlientow();





    }
}
