
import java.util.*;

public class Set_Hash {
    
    public static void main(String[] args) {
        // hashset
        HashSet<String> h1= new HashSet<>();

        h1.add("C");
        h1.add("C++");
        h1.add("Java");
        h1.add("Python");

        System.out.println(h1);

        //create LinkedHashSet 

        LinkedHashSet h2= new LinkedHashSet<>(5);
        // uses hybrid data

        h2.add("A");
        h2.add(10);
        h2.add(50);
        h2.add("NTC");
        h2.add("welcome");

        System.out.println(h2);

    }
}
