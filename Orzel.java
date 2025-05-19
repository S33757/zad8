public class Orzel extends Ptak{

    public Orzel(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek(){
        return "Orzel skrzeczy";
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Gory";
    }
}
