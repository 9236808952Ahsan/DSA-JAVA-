import java.util.*;

public class ArrayTranspose {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROWS");
        int rows = sc.nextInt();
        System.out.println("ENTER COLUMNS");
        int col = sc.nextInt();

        int numbers[][] = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(numbers[i][j] + " ");
            }

            System.out.println();
        }

    }
}
