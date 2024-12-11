/*  this is also called 1) non static varible fun
                       2) Instance member varible
                       3) object member varible 
**/

public class Non_static_fun {



    void getdata()
    {
        System.out.println("this is get data function");
    }

    void setdata()
    {
        System.out.println("this is set data");
    }
    public static void main(String[] args) {

        System.out.println("this is main function");

        Obj e1= new Obj();
        System.out.println("this is object class object");
        e1.fun1();
        e1.fun2();
        e1.x=10;   //call instance member varible using object   // assigned value to member varible
        System.out.println(e1.x);

        System.out.println(e1.y); // y will print 0 because its default in java if we dont assign value


        Non_static_fun e2= new Non_static_fun();
        e2.getdata();
        e2.setdata();
    }
    
}

class Obj{
    
    int x;   // instance(object) member varible
    int y;
    
     void fun1()
    {
        System.out.println("fun 1");
    }

    //this is fun2()
     void fun2()
    {
      System.out.println("fun 2");
    }
}