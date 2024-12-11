import java.io.*;
public class FileH1 {

    public static void main(String[] args)  throws IOException      // throws ioexception  used bcz of line no-11 its risky
    // it might throw error at compiletime thats why its checked error for checked error java must be rady for exception thats why we already used this throws
    
    {
        
        File f1=new File("a.text");
        System.out.println(f1.exists());
        System.out.println(f1.canWrite());   // these 2 line will give false output

        f1.createNewFile();
        System.out.println(f1.exists());
        System.out.println(f1.canWrite()) ;  // these 2 line will gies true output becase we created the new file using line 11 function now u can create file


    }
    
}
