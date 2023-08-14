import java.util.*;

public class array {
    public static void main(String args[]) {
        String words[] = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }

        for (String n : words) {
            System.out.println(n + " ");
        }
    }
}
