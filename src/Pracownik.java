import java.util.ArrayList;
public class Pracownik {
    String imie;
    String nazwisko;
    double przepracowaneGodziny;
    double stawkaPodstawowa;
    ArrayList<Pracownik> pracownicy;

    public Pracownik(String imie, String nazwisko, double przepracowaneGodziny, double stawkaPodstawowa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.przepracowaneGodziny = przepracowaneGodziny;
        this.stawkaPodstawowa = stawkaPodstawowa;
        pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void wszyscyPracownicy() {
        System.out.println("Pracownicy w firmie: ");
        for (int i = 0; i < pracownicy.size(); i++) {
            System.out.println(pracownicy.get(i).getImie() + " " + pracownicy.get(i).getNazwisko());
        }
    }

    public void wynagrodzenie() {
        stawkaPodstawowa = stawkaPodstawowa();
        if (przepracowaneGodziny <= 40) {
            System.out.println("Wynagrodzenie wynosi " + przepracowaneGodziny * stawkaPodstawowa + "zl.");
        } else if (przepracowaneGodziny > 40 && przepracowaneGodziny <= 60) {
            double nadgodziny = przepracowaneGodziny - 40;
            System.out.println("Wynagrodzenie wynosi " + ((40 * stawkaPodstawowa) + (nadgodziny * (1.5 * stawkaPodstawowa))) + "zl.");
        } else {
            System.out.println("Liczba przepracowanych godzin jest za duża, wynosi " + przepracowaneGodziny + "h/tyg.");
        }
    }

    private double stawkaPodstawowa() {
        if (stawkaPodstawowa < 9.375) {
            System.out.println("Stawka podstawowa jest za mała, wynosi " + stawkaPodstawowa);
        }
        return stawkaPodstawowa;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pracownicy=" + pracownicy +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}

