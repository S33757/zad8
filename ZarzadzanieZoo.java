public class ZarzadzanieZoo {
    public static void main(String[] args) {

        Ssak ssak1 = new Ssak("Ssak1", 3);
        Lew lew1 = new Lew("Lew1", 6);
        Slon slon1 = new Slon("Slon1", 5);
        Orzel orzel1 = new Orzel("Orzel1", 2);
        Pingwin pingwin1 = new Pingwin("Pingwin1", 3);
        Waz waz1 = new Waz("Waz1", 4);

        System.out.println(ssak1.wydajDzwiek());
        System.out.println(lew1.wydajDzwiek());

        System.out.println(ssak1.poruszajSie());
        System.out.println(lew1.poruszajSie());

        System.out.println(ssak1.wyswietlInfomacje());
        System.out.println(lew1.wyswietlInfomacje());

        System.out.println(ssak1.srodowiskoNaturalne());
        System.out.println(lew1.srodowiskoNaturalne());

    }
}
