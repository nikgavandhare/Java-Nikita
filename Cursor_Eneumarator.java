import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Cursor_Eneumarator 
{
    public static void main(String[] args)
    {
        // lets create vvector bcz enemarator used on  vector only

        Vector<String> v1= new Vector<>();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");

        // create Emnemurator 
        // enumrator has fun():- hasmoreelemets() and nextelemenrs

        Enumeration<String> e1= v1.elements();  // usese elements() func of stack and vector 

        while (e1.hasMoreElements()) 
        {
            System.out.println(e1.nextElement());
            
        }

        System.out.println("\n");

        // lets try on stack
        Stack<Integer> s1= new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        // try Enemurator on stack

        Enumeration<Integer> e2=s1.elements();

        while (e2.hasMoreElements())
        {
            System.out.println(e2.nextElement());
            
        }
        
    }
    
}
