

    class Data
    {

        int n;
        
        int x;
    
        private static int y;
    
        void fun1()
        {
            y=60;
        }
    
        void fun2()
        {
         
            System.out.println(y);
    
        }
    
        void fun3()
        {
            y=250;
        }
    }

    
public class Example
 {
    public static void main(String[] args)
    {
        System.out.println("this is main function");

        //create object for class data to access thos member fun and member varible into main fun

        //class_name ref_var = new class_name();\

        Data d1= new Data();
        d1.fun1();
        d1.x=10;
        System.out.println(d1.x);

        /* System.out.println(d1.y); for this line you will get error called y has private access in data class so we cant use this intoo main class
        */

/*to access private member varible y who has static member varible we can access it simply calling by syntax:- class_name.varble; 
 or simply we can make the function which has y varible to static function so just make fun2() to static void fun2(); and dirctly acces it by above syntax*/ 
   
        Data e1= new Data();  // create 2nd object
  
        Data e2= new Data();  // create 3rd object

            e1.fun1();  /// first y= 60
            e2.fun3();  // now y became y=250
            e1.fun2();  // now just print y that is above y=250

}
    
 }



