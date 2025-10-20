package exception;
import java.util.Scanner;
public class Chargpt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] myNums = {12, 62, 37, 49, 51};

        System.out.print("Skriv in ett index mellan 0-4: ");
        int index = scanner.nextInt();

        try {
            int värde = myNums[index];
            System.out.println("Talet på plats " + index + " är: " + värde);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index " + index + "finns inte i arrayn!");
        }

        scanner.close();
    }
}
