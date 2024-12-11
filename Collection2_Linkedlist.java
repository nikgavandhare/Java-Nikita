import java.util.*;

public class Collection2_Linkedlist
{
    public static void main(String[] args) 
    {
        //create a linkeedlist
        LinkedList<String> l1=new LinkedList<>();

        l1.addFirst("Nikita");
        l1.addLast("Gondhare");

        l1.add(1,"Aniket");

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());

        System.out.println(l1.get(1));


        // lets see vector
        //vector<> v1= new Vector();

        Vector<String> v1= new Vector<>();
        v1.add("b");
        v1.add("c");

        System.out.println(v1);
        System.out.println(v1.get(1));

        //lets create stack

        Stack<Integer> s1=new Stack<>();

        //push insert element instack
        s1.push(2);
        s1.push(3);
        s1.push(5);
        s1.push(7);

        System.out.println(s1);

        // pop removes top element i.e last element
        s1.pop();
        System.out.println(s1);
        
        // it only show element but wont remove elment
        
        System.out.println(s1.peek());
    }

    
}