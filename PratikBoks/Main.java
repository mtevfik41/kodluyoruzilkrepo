package kodluyoruzilkrepo.PratikBoks;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Kevin", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 40, 95, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}