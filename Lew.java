public class Lew extends Ssak{

    public Lew(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Lew ryczy";
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Sawanny";
    }
}
