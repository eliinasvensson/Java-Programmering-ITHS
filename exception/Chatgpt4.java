package exception;
import java.util.Scanner;
public class Chatgpt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in ett valfritt heltal: ");
        int tal1 = scanner.nextInt();
        System.out.print("Skriv in ett till valfritt heltal: ");
        int tal2 = scanner.nextInt();

        try{ int div = tal1/tal2;
        System.out.println("Resultatet av divisonen: " + div);}
        catch(ArithmeticException e){System.out.println("Går ej att diviera med noll!");}

        scanner.close();
   
    }    
}
