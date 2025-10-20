package exception;

public class ArrayIndexTest {
    public static void main(String[] args) {
       
   
    int[] myArray = new int[5];
 
    try {myArray[44] = 500;}
    catch (ArrayIndexOutOfBoundsException e)
    {System.out.println("Ojoj " + e.getMessage());}
   
    }
}
