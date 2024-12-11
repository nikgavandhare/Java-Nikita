
interface I1
{
    int x=88;
     
    void f1();

    static void f2()
    {
        System.out.println(x);
    } 
}

interface I2 extends I1
{
    int x=100;
    int y=22;

    void f3();

    static void f2()
    {
        System.out.println(x);
    }

}

// create class to implement interface

class Example implements I2
{
    // make static fun of f2() so that we can access
   static void f2()
   {
        System.out.println(x);

   } 
    // overide f1() from I1
  public void f1()
  {

  } 
  
  // override f2() from I2
  public void f3()
  {

  }
}

// this is main func()
public class InterF {

    public static void main(String args[])
    {
        //Example e1 =new Example();
        //e1.f2();
        //System.out.println(e1.y); 
        I1.f2();
        I2.f2();  // bcz f2() is static thats why we can directly acces using class_name.fun_name();
    }
    
}
