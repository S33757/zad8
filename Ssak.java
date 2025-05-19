public class Ssak extends Zwierze{

    private boolean maFutro;

    public Ssak(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "Ssak wydaje drzwiek (np. Szczeka jak pies)";
    }

    @Override
    public String poruszajSie(){
        return "Ssak chodzi na 2 lub 4 konczynach";
    }

    public void karmiMlekiem(){
        System.out.println("Ssak karmi mlekiem");
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Lad";
    }
}
