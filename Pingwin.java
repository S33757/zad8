public class Pingwin extends Ptak{

    public Pingwin(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek(){
        return "Pingwin wydaje cichy drzwiek";
    }

    @Override
    public void lata() {
        System.out.println("Pingwin nie lata");
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Antarktyda";
    }
}
