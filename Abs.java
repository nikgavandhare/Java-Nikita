abstract class Parent
{
    int x,y;

    void f1()
    {
        x=9;
        y=7;
        System.out.println(x);
        System.out.println(y);
    }

    // this is abstract class
    abstract void f2(); 

     // this is constructor
    Parent()
    {
        System.out.println("this is parent class constructor");
    }
}

class Child extends Parent
{
    int a,b;
    void f3()
    {
        a=66;
        b=77;
        System.out.println(a);
        System.out.println(b);
    }


    // we override  abstract void f2() function of parent class into child class so that we can assess it through object
    void f2()
    {
        System.out.println("this is override function of f2()");
    }


    // child class constructor
    Child()
    {
        System.out.println("this is child class contructor");
    }

}
public class Abs 
{
    public static void main(String args[])
    {
        // child class object
        Child c1 =new Child();
        c1.f1();
        c1.f3();   
        c1.f2();


    }
    
}
