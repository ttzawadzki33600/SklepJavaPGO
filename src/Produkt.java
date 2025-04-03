public class Produkt{
    private int id;
    private String nazwa;
    private double cena;
    private String kategoria;
    private int ilosc_w_magazynie;


    public Produkt(int id, String nazwa,  double cena, String kategoria, int ilosc_w_magazynie){
        this.id = id;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.ilosc_w_magazynie = ilosc_w_magazynie;

    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Kategoria: " + kategoria);
        System.out.println("Ilosc w magazynie: " + ilosc_w_magazynie);

    }

    public void setID(int id){
        if (id < 0) {
            this.id = id;
        }
        else {
            this.id = id;
        }



    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    public void setCena(double cena){
        this.cena = cena;
    }
    public void setKategoria(String kategoria){ this.kategoria = kategoria; }
    public void setIlosc_w_magazynie(int ilosc_w_magazynie){
        this.ilosc_w_magazynie = ilosc_w_magazynie;
    }

    public int getID(){
        return id;
    }
    public String getNazwa(){
        return nazwa;
    }
    public double getCena(){
        return cena;
    }
    public String getKategoria(){
        return kategoria;
    }
    public int getIlosc_w_magazynie(){
        return ilosc_w_magazynie;
    }





}