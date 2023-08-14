import java.util.*;

public class StringCompare {
    public static void main(String args[]) {
        System.out.println("ENTER THE FIRST WORD");

        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();

        System.out.println("ENTER THE SECOND WORD");

        String word2 = sc.nextLine();

        System.out.println();
        if (word1.compareTo(word2) == 0) {

            System.out.println("both are equal");

        } else {
            System.out.println("not equal");
        }
    }
}
