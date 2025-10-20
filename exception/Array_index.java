package exception;
import java.util.Scanner;
import java.util.*;

public class Array_index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNums [] = {10, 20, 30, 40, 50};
        System.out.println("Skriv in ett index 0-4: ");
        int valtIndex = scanner.nextInt();

        läsIndex(scanner);
    }

    public static void läsIndex(Scanner scanner){
        try {
            System.out.println(valtIndex);
        }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("Indexen du skrev in är utan för arrayen!");}
    }
}
