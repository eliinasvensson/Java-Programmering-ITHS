package exception;
import java.util.Scanner;

public class Chatgpt3 {

    public static void checkAge(int age) throws Exception{
        if (age < 18){
            throw new Exception("Du är inte myndig!");
        } else {
            System.out.println("Du är välkommen in!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in din ålder: ");
        int age = scanner.nextInt();

        try {checkAge(age);}
        catch(Exception e){
            System.out.println("Fel: " + e.getMessage());
        }

        scanner.close();
    }
}
