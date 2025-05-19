public class Krokodyl extends Gad{

    public Krokodyl(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void zrzucaSkore() {
        System.out.println("Krokodyl sciera skrore stopniowo");
    }
}
