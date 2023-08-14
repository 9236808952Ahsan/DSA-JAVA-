

// using LinkedList implementation

public class stackII {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty()
        {
            return head==null;
        }

        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;

            }

            int top=head.data;
            head=head.next;
            return top;
        }


        public static int peek()
        {
            if(isEmpty())
            {
                return -1;  
            }
            return head.data;
        }

    }

    // reversing a string

    public static void reverseString(String str)
    {
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);
        }

        str=result.toString();
    }

    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);


        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }

    String str="abcd";
    String result=reverseString(str);
    System.out.println(result);
    
}
