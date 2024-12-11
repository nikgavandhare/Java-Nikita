
public class Static_fun {

        //this is fun1()
    static void fun1()          // we have to put static befor the vaoid functin_name() because for copileing we have to se static function to ru  in main function

    {
        System.out.println("A");
    }

    //this is fun2()
    static void fun2()
    {
System.out.println("B");
    }

    /*this is main function what ever in main function first line written is complie first 
    only main function has compile **/
    
    public static void main(String[] args) {
        System.out.println("C");
        fun1();
        fun2();
    
        // using Class_name.Fun_name syntax we can acces functions from another class area into main function
        Area.fun1();
        Area.fun2();
    }
    
}


/*  lets create another class and try to acces this class function in main function using 
syntax:- class_name.function_name **/
// the function must be static then only we canuse above syntax to access them into main function

class Area
{
    static void fun1()
    {
        System.out.println("Area 1");
    }

    //this is fun2()
    static void fun2()
    {
      System.out.println("Area 2");
    }

    // BOth fun1() and fun2() are differnt from other 2 function in Static_fun class they are not same
}