
public class circularDoubllyLL {
    Node head = null;
    Node tail = null;
    int size = 0;

    class Node {
        int value;
        Node next, prev;

Node(int value,Node next,Node prev){ 

this.value = value; 
this.next = next; 
this.prev = prev; 
}
    }

    void print() {
        if (size == 0) {
            System.out.println("CDLL is empty");
            return;
        }
        Node temp = tail.next;
        while (temp != tail) {
            System.out.print(temp.value + " ==> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

void addHead(int value) { 
Node newNode = new Node(value,null,null); 
if(size==0) { 
tail = head = newNode; 
newNode.next = newNode; 
newNode.prev = newNode; 
} 
else { 
newNode.next = head; 
newNode.prev = head.prev; 
head.prev = newNode; 
newNode.prev.next = newNode; 
head = newNode; 
} 
size++; 
}
    

    void addTail(int value) {
        Node newNode = new Node(value, null, null);
        if (size == 0) {
            head = tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = tail.next;
            newNode.prev = tail;
            tail.next = newNode;
            newNode.next.prev = newNode;
            tail = newNode;
        }
        size++;
    }

    void removeHead() {
        if (size == 0) {
            System.out.println("CDLL is empty");
            return;
        }
        size--;
        if (size == 0) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head.next;
        temp.prev = tail;
        tail.next = temp;
        head = temp;
    }

void removeTail() { 

if(size==0) { 
System.out.println("CDLL is empty"); 
return; 
} 
size--; 
if(size==0) { 
head=null; 
tail=null; 
return; 
} 
Node temp = tail.prev; 
temp.next = head; 
head.prev = temp; 
tail = temp; 
}

    public static void main(String[] args) {
        circularDoubllyLL cdll = new circularDoubllyLL();
        cdll.addHead(444);
        cdll.addHead(222);
        cdll.addHead(777);
        cdll.addHead(555);
        cdll.addHead(999);
        cdll.print();
        cdll.addTail(666);
        cdll.print();
        cdll.removeHead();
        cdll.print();
        cdll.removeTail();
        cdll.print();
    }
}
