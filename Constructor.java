class Demo
{
    int x;
    int y;

    
    // this is parameterized constructor // its defined by compiler
    Demo(int p, int q)
    {
        x=p;
        y=q;
        System.out.println(x);
        System.out.println(y);
      
    }
    // one parameter is passed
        Demo(int m)
        {
            x=m;
            System.out.println(x);
        }

       // this is default constructor 
       Demo()
       {
        System.out.println("this is default constructor");
       } 
}





public class Constructor {

    public static void main(String[] args) {
        
        // create object

        Demo d1= new Demo(8,9);
        
        Demo d2= new Demo(77);

        Demo d3= new Demo();
       
    }
    
}
