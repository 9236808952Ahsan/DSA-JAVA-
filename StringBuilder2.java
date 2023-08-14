public class StringBuilder2 {
    // deleting and inserting new in the string


    public static void main(String args[]){
    StringBuilder sb = new StringBuilder("tony");
//Insert char
sb.insert(0, 'S');
System.out.println(sb);
//delete char
sb.delete(0, 1);
System.out.println(sb);


// append char to the string

StringBuilder sb1 = new StringBuilder("Tony");
sb.append(" Stark");
System.out.println(sb);

// print length of the string

StringBuilder sb2 = new StringBuilder("Tony");
sb.append(" Stark");
System.out.println(sb);
System.out.println(sb.length());



// reversing a string using string builder

StringBuilder sb4 = new StringBuilder("HelloWorld");
for(int i=0; i<sb.length()/2; i++) {
int front = i;
int back = sb.length() - i - 1;
char frontChar = sb.charAt(front);
char backChar = sb.charAt(back);
sb.setCharAt(front, backChar);
sb.setCharAt(back, frontChar);
}
System.out.println(sb);

    
}
}