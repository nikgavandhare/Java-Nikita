import java.io.*;


public class ExceptionH2 {

    public static void main(String[] args) throws IOException
    {
        System.out.println("A");
        try{
        throw new IOException("massage not found");
        }   
        catch(IOException e1)
        {
            System.out.println(e1.getMessage());
        }

}

    
}
