// performing two loops  with i and j alternate with storing all the elements of i in curr
// and combining it with elements of j  in form of pairs............APPROACH?

public class PrintPairs {
    public static void printpairs(int numbers[])
    {
        for(int i=0;i<numbers.length-1;i++)
        {
            int curr=numbers[i];
             for(int j=i+1;j<numbers.length-1;j++)
             {
                System.out.print("("+curr+","+numbers[j]+") ");
             }  
             System.out.println();
        }
 
    }
    public static void main(String args[])
    {

        int numbers[]={2,3,4,5,6,7};
        printpairs(numbers);
    }
    
}
