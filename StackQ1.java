// push  DATA on the bottom of stack..



import java.util.*;

public class StackQ1 {
    
    public static void pushAtBottom(int data,Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    // Reversing a Stack.....

    public static void reverse(Stack<Integer>s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);

    }

    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            reverse(s);
             
            // pushAtBottom(5,s);
            while(!s.isEmpty())
            {
                System.out.println(s.peek());
                s.pop();
            }
    
        }
    }
    
