// WAP to print the table of a number using while loop

import java.util.*;
public class class1 {
    public static void main(String args[]){

        System.out.println("Enter the Number");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;

        while(i<11){
            System.out.println(num+"x"+i+"="+(num*i));
            i++;
            
        }
      



    }
    
}
