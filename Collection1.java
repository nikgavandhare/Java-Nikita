import java.util.*;


public class Collection1 
{
    public static void main(String[] args) 
    {

        ArrayList<String> l1=new ArrayList<>(5);

        l1.add("A");
        l1.add("B");
        l1.add("C");

        // USING FUN ADD(INDES,ELEMENT)
        l1.add(1, "Z");

        // Iterator class  
        Iterator<String> i1=l1.iterator();
        
        
        while (i1.hasNext())
        {
            // i1.hasnext store in string s1 by doing type casting by below syntax
            String s1=(String) i1.next();

            if (s1!="Z")
            {  
                System.out.println(s1);
            }            
        }
        
    }
    
}
