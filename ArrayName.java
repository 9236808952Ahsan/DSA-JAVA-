import java.util.*;

public class ArrayName {
    public static void main(String args[]) {
        System.out.println("enter size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String name[] = new String[size];

        for (int i = 0; i < size; i++) {

            name[i] = sc.next();
        }

        System.out.println("\n");
        System.out.println("IN ARRAY FORM.......\n");

        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }

    }
}
