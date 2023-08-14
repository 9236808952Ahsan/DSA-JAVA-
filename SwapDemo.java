public class SwapDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swapping" + " x = " + x + " y = " + y);
        int temp = y;
        y = x;
        x = temp;

        System.out.println("After swapping" + " x = " + x + " y = " + y);
    }
}