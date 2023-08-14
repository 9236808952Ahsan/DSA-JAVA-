
import java.util.*;
public class Check {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Float number=sc.nextFloat();
        if(number<=100){
            
            if(number>=50){
                System.out.println("number is between 50 and 100");
            }
            else{
                System.out.println("Less than 50");
            }
        }
        else {
            System.out.println("number is greater than 100");
        }
        


    }
    
}
