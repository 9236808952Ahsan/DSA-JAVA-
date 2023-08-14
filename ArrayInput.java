import java.util.*;



public class ArrayInput {
    public static void main(String[] args) {

        System.out.println("Enter Size Of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        
        int number1[] = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
            for (int j = 0; j < size; j++) {
                
           number[j]=sc.nextInt();
            }
           

        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(number[i]==number1[j])
                {
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
        }
        
       

    }

}
