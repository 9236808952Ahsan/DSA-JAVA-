public class StringBuilder1 {
    public static void main(String args[]){

StringBuilder sb = new StringBuilder("Tony");
//Set Char
System.out.println(sb.charAt(0));

    


// Setting a charcter in the string

StringBuilder sb1 = new StringBuilder("Tony");
//Get Char
sb.setCharAt(0, 'P');
System.out.println(sb);


// inserting some char at any index

{
StringBuilder sb2 = new StringBuilder("tony");
//Insert char
sb.insert(0, 'S');
System.out.println(sb);

// deletng char at some index

StringBuilder sb3 = new StringBuilder("tony");
//Insert char
sb.insert(0, 'S');
System.out.println(sb);
//delete char
sb.delete(0, 1);
System.out.println(sb);
}
}
}
