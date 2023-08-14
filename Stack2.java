
// using ARRAYLIST........



import java.util.ArrayList;
public class Stack2 {
   
     static ArrayList<Integer> list=new ArrayList<>();
    
    public static boolean isEmpty()
    {
        return list.size()==0;
    }

    // push....

    public static void push(int data)
    {
        list.add(data);
    }


    //pop............. 

    public static int pop()
    {
        if(isEmpty())
        {
            return-1;
        }
        int top =list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

// Again inserting to the same position......

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return list.get(list.size()-1);
    }


public static void main(String args[]) {
    Stack2 stack = new Stack2();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    while(!stack.isEmpty()) {
        System.out.println(stack.peek());
        stack.pop();
    }
}
}
