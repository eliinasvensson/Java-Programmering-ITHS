package codealongs.Exception.finished;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try { System.out.print("Enter a number: ");
            scanner.nextInt();
        System.out.println("That's a good number!");}
        catch (InputMismatchException e) {
            System.out.println("Whoops! Wrong input type!");
        }
        finally {scanner.close();}
    }


}
