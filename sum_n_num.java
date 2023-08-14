public class sum_n_num {
    
    public static int sum(int num)
    {
    
        if(num==1)
        {
            return 1;

        }
        int sum1=sum(num-1);
        int sum2=sum1+num;
        return sum2;
           
    }

    public static void main(String argts[])
    {
        int num=5;
       System.out.println(sum(num));

    }

    
}
