import java.util.*;
 
// set bit\

public class BitManu2 {
   public static void main(String args[]) {
      int n = 5; //0101
      int pos = 1;
      int bitMask = 1<<pos;
 
      int newNumber = bitMask | n;
      System.out.println(newNumber);
   }
}
