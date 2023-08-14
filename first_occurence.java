public class first_occurence {
    public static int firstOccr(int key,int arr[],int i){
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccr(key,arr,i+1);
    }
   public static void main(String args[])
   {
    int arr[]={8,3,6,9,5,10,2,5,3};
    System.out.println(firstOccr(5,arr,0));

   } 
}
