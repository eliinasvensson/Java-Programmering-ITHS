package exception;

public class ArthementicTest {
    int a = 6;
    int b = 3;
   
 
    public void DivTest(){
        try{
            int div = a/b;
            System.out.println(div);
        } catch (ArithmeticException e){
            System.out.println("Går inte att dividera med 0 " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        ArthementicTest example = new ArthementicTest();
        example.DivTest();
    }
}
