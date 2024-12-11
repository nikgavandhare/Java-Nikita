import java.util.*;

public class Collection_Demo1 {

    public static void main(String[] args) 
    {
        ArrayList<Integer> l1= new ArrayList<Integer>(4);

         l1.add(1);
         l1.add(2);
         l1.add(3);
         l1.add(4);
         System.out.println(l1);
           
         // create another arraylist

         ArrayList<Integer> t1= new ArrayList<Integer>(3);
         t1.add(3);
         t1.add(4);
         t1.add(5);

         // perform operation addAll(collection t1)

        l1.addAll(t1);
        System.out.println(l1);

         //  conatians() fun

         System.out.println(  l1.contains(t1));

         // check isEmpty()

         System.out.println(l1.isEmpty());

        
         // perform remove() fun

         l1.remove(1);
         System.out.println(l1);

         // removeAll(collection t1)
         l1.retainAll(t1);

         System.out.println(l1);



        
         

    


    }
    
}
