package arv;

public class Main {
    public static void main(String[] args) {

        Hund hund1 = new Hund();
        
        hund1.presenter();
        hund1.skäll();
        hund1.sov();

        hund1.spring(5);
        System.out.println("Hundens energi: " + hund1.getEnergi());
    }
}
