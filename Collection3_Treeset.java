import java.util.TreeSet;

public class Collection3_Treeset {

    public static void main(String[] args) {
        
        //Treeset
        // sort the set

        TreeSet<Integer> t1=new TreeSet<>();

        t1.add(11);
        t1.add(2);
        t1.add(10);
        t1.add(22);
        t1.add(55);
        t1.add(70);

        System.out.println(t1);

        // perform some functions
        t1.first();
        System.out.println(t1.first());

        System.out.println(t1.last());

        System.out.println(t1.headSet(22));

        System.out.println(t1.tailSet(10));

        System.out.println(t1.subSet(11, 55));

        System.out.println(t1.comparator());
    }
    
}
