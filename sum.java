import java.util.*;

public class sum {
    public static int multiplynum(int a, int b) {
        int multiply = a * b;
        return multiply;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = multiplynum(a, b);
        System.out.println("MULTIPLICATION OF BOTH THE NUMBERS:: " + multiply);
    }

}
