
class Example
{

    int x,y;

    void fun1(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
}


public class ThisK {
    
    public static void main(String[] args)
    {

        // create object

        Example e1= new Example();

        e1.fun1(55, 66);
        e1.display();
        

    }
}
