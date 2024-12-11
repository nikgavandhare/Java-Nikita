//                     ******************** Using Thread Class ***************************



class Process1 extends Thread
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

class Process2 extends Thread
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

public class MultiT2
{
    public static void main(String[] args) 
    {
        // create object of both classes

        Process1 p1= new Process1();
        Process2 p2= new Process2();

        // direct start procces no need to create obj of Thread class

        p1.start();
        p2.start();
    }
    
}
