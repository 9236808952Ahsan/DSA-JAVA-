import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String args[]){
        
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        System.out.println(list);
        
        int first=list.get(0);
        int second=list.get(2);
        System.out.println(first);
        System.out.println(second);

        // using index add element

        list.add(0,12);
        System.out.println(list);

        // set element in place

        list.set(0,78);
        System.out.println(list);

        // delete element acc to indx

        list.remove(3);
        System.out.println(list);

        // size of arr

        int siz=list.size();
        System.out.println(siz);

        // displaying each element

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

    }
    
}
