// comparing first and last element continously and update the first forward and the
// last in backward...............APPROACH ?

public class ReverseArray {
    public static void reverse(int numbers[])
    {
        int first=0;
        int last=numbers.length-1;
        while(first<last)
        {
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }

    }
    public static void main(String args[])
    {
        int numbers[]={2,3,4,5,6,7};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);

        }
    }
    
}
