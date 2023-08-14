import java.util.*;

public class StringInput {
    public static void main(String args[]) {
        System.out.println("ENTER THE WORDS");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

}
