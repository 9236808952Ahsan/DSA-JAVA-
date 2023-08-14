import java.util.*;

public class averageFUN {
    public static float PrintAver(int a, int b, int c) {

        int sum;
        sum = a + b + c;
        int average;
        average = (sum / 3);
        System.out.println(average);
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ALL THREE NUMBERS");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        PrintAver(a, b, c);

    }

}
