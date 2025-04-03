public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public Klient(int id, String imie, String nazwisko, String email) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = false;


    }


    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("Czy staly klient?: " + (czyStaly ? "Tak": "Nie"));
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCzyStaly(boolean jaki){
        this.czyStaly = jaki;
    }

    public int getId() {
        return id;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getEmail() {
        return email;
    }
    public boolean isCzyStaly() {
        return czyStaly;
    }

}
