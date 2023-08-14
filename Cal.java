import java.util.*;
public class Cal
{
	public static void main(String[] args) {
		float a;
		float b;
		double s;
		System.out.println("Enter a and b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
		   s=a+b;
		   System.out.println("SUM="+s);
		   break;
		 case 2:
		     if(b==0){
                System.out.println("invalid value of b");
                break;
             }
             else{
		     float d=a/b;
             
		     System.out.println(d);
		     
             }
		  case 3:
		      float e=a*b;
              System.out.println(e);
		      break;
		  case 4:
		      float f=a-b;
		      System.out.println(" "+f);
		      break;
		  default:
		  System.out.println("invalid operator");
		      
	}}
}
