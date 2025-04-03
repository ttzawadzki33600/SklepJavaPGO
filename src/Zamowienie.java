public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosc;
    private String status;

    public Zamowienie(int id, Klient klient, Produkt[] produkty, int[] ilosc, String status) {
        this.id = id;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosc = ilosc;
        this.status = status;

    }
    public int getId() {
        return id;
    }
    public Klient getKlient() {
        return klient;
    }
    public Produkt[] getProdukty() {
        return produkty;
    }
    public int[] getIlosc() { return ilosc;}
    public String getStatus() {
        return status;
    }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosc[i];
        }
        return suma;


    }




    public void display(){
        System.out.println("ID Zamówinienia: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        System.out.println("Status: " + status);
        System.out.println("Produkty");
        for(int i = 0; i < produkty.length; i++){
            System.out.println(" - " + produkty[i].getNazwa() + "x" + ilosc[i] + " (Cena: " + produkty[i].getCena() + "ZŁ");
        }
        System.out.println("Łączna wartość koszyka: " + obliczWartoscZamowienia() + " ZŁ");
    }


}

