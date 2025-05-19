public class Zwierze {

    protected String Nazwa;
    protected int Wiek;

    public Zwierze(String nazwa, int wiek) {
        Nazwa = nazwa;
        Wiek = wiek;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public int getWiek() {
        return Wiek;
    }

    public String wydajDzwiek(){
        return "Zwierze wydaje drzwiek";
    }

    public String poruszajSie(){
        return "Zwierze sie porusza";
    }

    public String wyswietlInfomacje(){
        return "Nazwa: " + Nazwa + ", Wiek: " + Wiek;
    }

    public String srodowiskoNaturalne(){
        return "Brak danych";
    }

}
