import java.util.*;

public class StringSubstring {
    public static void main(String args[]) {
        System.out.println("ENTER THE WORD OR SENTENCE");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String sub = sentence.substring(0, 8);

        System.out.println(sub);

    }
}
