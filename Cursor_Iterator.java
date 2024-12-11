import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Cursor_Iterator {

    public static void main(String[] args) {
        
        // iterator can be used on all collection objects :set and list,vector
        // lets try on set

        HashSet<Integer> s1= new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        // lets create Interator 
        // iterator has 2 fun:-  hasNext() and next() and remove()

        Iterator<Integer> i1= s1.iterator();

        while (i1.hasNext())
        {
            System.out.println(i1.next());
            
        }

        System.out.println("\n");
        // lets create list and try iterartor on list
        LinkedList<String> l1= new LinkedList<>();
        l1.add("N");
        l1.add("I");
        l1.add("K");
        l1.add("I");
        l1.add("T");
        l1.add("A");

        // creator iterator for list
        Iterator<String> i2=l1.iterator();

        while (i2.hasNext())
        {
            System.out.println(i2.next());
            
        }
    }
}