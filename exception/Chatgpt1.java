package exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Chatgpt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean klar = false;

        while (!klar){
        try { System.out.print("Skriv in ett valfritt heltal: ");
        int tal1 = scanner.nextInt();
        System.out.print("Skriv in ett till valfritt heltal: ");
        int tal2 = scanner.nextInt();
        int div = tal1/tal2; System.out.println("Resultat: " + div);
        klar= true;}
        catch (InputMismatchException e){System.out.println("Du måste skriva med siffror! Inte text!");
        scanner.nextLine();}
        catch (ArithmeticException e){System.out.println("Går inte att dividera med noll");
        scanner.nextLine();}
        catch (Exception e){System.out.println("Felmeddelande: " + e.getMessage());
        scanner.nextLine();}
        finally {System.out.println("Denna körs alltid!");
        scanner.nextLine();}
        }

        scanner.close();
        System.out.println("Pogrammet är klart!");

    }
    
}
