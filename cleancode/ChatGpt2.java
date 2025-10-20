package cleancode;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ChatGpt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = läsNamn(scanner);
        int age = läsÅlder(scanner);
        undersökÅlder(name, age);
        scanner.close();

    }
    public static String läsNamn(Scanner scanner){
        System.out.print("Namn: ");
        return scanner.nextLine();
    }

    public static int läsÅlder(Scanner scanner){
        while (true){
        try {System.out.print("Ålder: ");
             return scanner.nextInt(); }
        catch (InputMismatchException e){
            System.out.println("Fel! Ange ett heltal: ");
            scanner.nextLine(); }
        }     
    }
    public static void undersökÅlder(String name, int age){
    if (age < 18) {
        System.out.println("För ung!");
    } else {
        System.out.println("Välkommen, " + name);
    }
}
}
