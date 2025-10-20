public class ExceptionTest {
    static public boolean[] coolArray(int size, int position) {
    boolean [] boolArray = new boolean[size];
    boolArray[position] = true;
    return boolArray;
    }

    public static void main(String[] args) {
        coolArray(5, 1);
    }
}
