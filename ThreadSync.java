import java.util.Scanner;  // to use scanner we import scanner from util packaage

class Account
{
    // create constructor of class

    int bal;
    Account(int b)
    {
        bal=b;
    }

     public boolean Is_Bal_Sufficient(int w)    // boolean returntype because it returns true and false  // w is withdraw amount
    {
        if(bal>w)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

    //create fun for withdrwa ammount
    void withdraw(int amt, String g1)
    {
        bal=bal-amt;
        System.out.println(g1+"Transaction sucussessful");
        System.out.println(g1+"current balance is"+ bal);
        
    }

}


// create class for custor to withdraw amount from account

class Customer implements Runnable
{
    String m1;
    Account x1;    // x1 is object of account class
    //create contsructor

    Customer(Account j1,String h1 )   // take ref from line  no 86,87
    {
        x1=j1;
        m1=h1;

    }
     
    // create run() bcz its implements Runneble interface
    public void run()
    {
        

    synchronized(x1)       /// used syn() for getting expected result
     {
        System.out.println("enter amount to withraw for :"+m1+":");

        Scanner s1= new Scanner(System.in);
        int amt = s1.nextInt();

        if(x1.Is_Bal_Sufficient(amt))
        {
            x1.withdraw(amt,m1);
        }
        else
        {
            System.out.println("insufficent Balance");
        }
     }

    }
    
}



public class ThreadSync 
{
    public static void main(String[] args)
    {
        Account a1 =new Account(5000);      // 5000 is int b (i.e balance fro line  no 6)
        Customer c1 = new Customer(a1,"Nikita");
        Customer c2= new Customer(a1,"Akash");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
    
}
