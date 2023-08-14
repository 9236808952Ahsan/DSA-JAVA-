import java.util.Scanner;

public class STRreverseRecursion {

    static String strrev(String s) {
        if (s == null || s.length() <= 1)// BC
        {
            return s;
        }
        return strrev(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any String:");
        String s = obj.nextLine();
        System.out.println("Reverse Result::" + STRreverseRecursion.strrev(s));
    }
}
