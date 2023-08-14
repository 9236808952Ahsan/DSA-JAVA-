import java.util.*;
public class count {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(n!=0)
        {
            n=n/10;
            i++;
            

        }
        System.out.println(+i);


    }
    
}
