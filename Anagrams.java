import java.util.*;
public class Anagrams {
    public static void main(String args[]){
        String str=new String();
        String str1=new String();
        int a=str.length();
        int b=str1.length();
        int count=0;
        if(a==b){
            int  arr[]=new int[a];
            Arrays.sort(arr);
            int arr1[]=new int[b];
            Arrays.sort(arr1);
            for (int i=0;i<=a;i++) {
                if(arr[i]==arr1[i]){
                     count=count+1;
                }
                else{
                    System.out.println("string is not a anagram");
                }
                
            }
        
        }


        
}}
