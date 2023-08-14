

// STACK IN FORM OF linked list..


public class Stack1 {

    static class Node{
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    // Empty stack..........

    static class Stack{
        public static Node head;
        
        public static boolean isEmpty()
        {
            return head==null;
        }

        // INSERTING push  AT STARTING or top of stack........

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

       
        // DELETING ,pop. A ELEMENT FROM STACK
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

        
        // Again ,peek ...getting the deleted element.
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }


    }


        public static void main(String args[])
        {
            Stack s=new Stack();
            s.push(1);
            s.push(2);
     
            s.push(3);
            s.push(4);
            while(!s.isEmpty())
            {
                System.out.println(s.peek());
                s.pop();
            }
    
        }
    }

    

