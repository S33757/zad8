public class Gad extends Zwierze{

    private boolean czyZimnoSkory;

    public Gad(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek(){
        return "Gad syczy";
    }

    @Override
    public String poruszajSie(){
        return "Gad porusza sie na 4 konczynach";
    }

    public void zrzucaSkore(){
        System.out.println("Gad zrzuca skore");
    }

    @Override
    public String srodowiskoNaturalne(){
        return "W cieplym srodowisku";
    }
}
