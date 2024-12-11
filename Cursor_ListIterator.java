import java.util.LinkedList;
import java.util.ListIterator;

public class Cursor_ListIterator {
    
    public static void main(String[] args) {
        
        //ListIterator used on List :arraylist,linkedlist

        LinkedList<String> l1=new LinkedList<>();

        l1.add(0,"A") ;
        l1.add(1,"B") ;
        l1.add(2,"C") ;
        l1.add(3,"D") ;
    
        // listiterator has 2 fun():= hasprevious() & Previous()
        ListIterator<String> e1=l1.listIterator();

        // hasnext() used to traverse forward
        System.out.println("Travers Forward");
        while (e1.hasNext()) 
        {
            System.out.println(e1.next());
            
        }

        // previous fiun used to traverse backward
        System.out.println("Travers Backward");
        while (e1.hasPrevious())
        {
            System.out.println(e1.previous());
            
        }
    }

}
