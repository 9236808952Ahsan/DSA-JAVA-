import java.util.*;
public class sum_of_digits {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println(+sum);


    }
    
}
