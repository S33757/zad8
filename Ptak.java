public class Ptak extends Zwierze {

    private boolean maSkrzydla;

    public Ptak(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek(){
        return "Ptak cwierka";
    }

    @Override
    public String poruszajSie(){
        return "Ptak skacze";
    }

    public void lata(){
        System.out.println("Ptak lata");
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Ponad ladem";
    }
}
