import java.util.*;

public class ArraySearch {
    public static void main(String args[]) {
        System.out.println("ENTER THE SIZE");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {

            numbers[i] = sc.nextInt();
        }

        System.out.println("ENTER THE NUMBER FOR SEARCH");

        int a = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == a) {
                System.out.println("This Number Found at Index Of  " + i);
            }

        }
    }
}
