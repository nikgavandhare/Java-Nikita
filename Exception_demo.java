public class Exception_demo {

    public static void main(String[] args) {
        
        
        String s=null;
        try{
        System.out.println(s.length());
        }
        catch( NullPointerException n1)
        {
            System.out.println(n1.getMessage());
        }
        finally
        {
            System.out.println("A");
        }
        int x=10,y=0,z;
       
        try{
            z=x/y;
        System.out.println(z);
        }
        catch(ArithmeticException a1)   
        {
            System.out.println(a1.getMessage());
        }
            System.out.println("B");
        
    }
}
