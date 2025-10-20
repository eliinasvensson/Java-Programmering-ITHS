package cleancode;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ChatGpt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summa1 = summeraTvåTal(scanner);
        System.out.println("Summan av talen blir: " + summa1);

        int summa2 = summeraTvåTal(scanner);
        System.out.println("Summan av talen blir: " + summa2);
        
        scanner.close();

    }

    public static int summeraTvåTal(Scanner scanner){
        while (true){
        try {
        System.out.print("Skriv in ett valfritt heltal: ");
        int tal1 = scanner.nextInt();
        System.out.print("Skriv in ett till heltal: ");
        int tal2 = scanner.nextInt();
        return tal1 + tal2;
            }
        catch (InputMismatchException e){
            System.out.println("Fel! Skriv in ett heltal: ");
            scanner.nextLine();
        }

        }
    }
}
