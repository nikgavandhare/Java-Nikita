
// *************  Multithreading using Runnable interface   ******************

/*
       interface Runnable
       {
            void run();
       }

       class Thread
       {
            Thread(Runnable Ref_var)
            {
            }

       }
            class Main
            {
                p.s.v.m(string []args)
                {
                    Thread t1= new Thread(Child_class ref_var)
                }
            }
 */


class Process1 implements Runnable
{
  public void run()
 {
    int i;
    for(i=0;i<=10;i++)
    {
        System.out.println("process 1:"+i);
    }
 }

}

class Process2 implements Runnable
{
  public void run()    // run() is function of Runnable interface we need to override this function into child class to access
  {
    int i;
    for(i=0;i<=10;i++)
    {
        System.out.println("process 2:"+i);
    }
  }

}

public class MultiT
{
    public static void main(String[] args) 
    {
        // create object of both classes

        Process1 p1= new Process1();
        Process2 p2= new Process2();

        // create thread using syntax:
        //                             Thread t1= new Thread(Ref_Var of child class object)
        //                          i.e  Thread t1 = new Thread(p1);
        
        Thread t1= new Thread(p1);
        Thread t2 =new Thread(p2);
        
        // we have to use t1. start() to start the thread to run

        t1.start();
        t2.start();
    }
    
}
