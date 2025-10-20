package exception;

public class NullPointerExample {
        String text;
 
    public void NullTest() {
        try {    
            System.out.println("Textens längd: " + text.length());
 
        } catch (NullPointerException e) {
            System.out.println("Fel: text-variabeln är null!");
        }
    }
    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        example.NullTest();
    }
}
