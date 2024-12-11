import java.io.FileOutputStream;
import java.io.*;

public class FileH2 {

    public static void main(String[] args) throws IOException
    { 
      
        // create string s1 
        String s1="Niki";
        FileOutputStream f1= new FileOutputStream("a.text",true);   // apend= true  it will store the all records after removing string or changing string

        char c1[]= s1.toCharArray();    // its char array to store string into char array
  
        for(int i=0;i<c1.length;i++)
        {
            f1.write(c1[i]);     
        }

        f1.close();
    
    }
    
}
