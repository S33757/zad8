public class Slon extends Ssak {

    public Slon(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Slon trabi";
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Sawanny";
    }
}
