import java.util.*;

public class agefun {
    public static int AgeValue(int n) {

        if (n > 18) {
            System.out.println("is eligible");

        } else if (n < 18) {
            System.out.println("not eligible");

        }

    }


    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AgeValue(n);

    }
}