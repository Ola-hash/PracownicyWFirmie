public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Ola", "Loza", 59, 8);
        Pracownik pracownik1 = new Pracownik("Igor", "Bodnar", 50, 9.5);
        pracownik.dodajPracownika(pracownik);
        pracownik.dodajPracownika(pracownik1);
        pracownik.wszyscyPracownicy();
        pracownik.wynagrodzenie();
    }
}
