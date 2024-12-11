class Nokia
{

    private int mic;
    private int cam;

    void setvalue()
    {
        mic =70;
        cam=90;
    }

    void display()
    {
            System.out.println(mic);
            System.out.println(cam);
    }

}

public class ClassesAndObject
{


    public static void main(String []aegs)
    {
            System.out.println(" this is main class");

            Nokia n1= new Nokia();
            n1.display();  // it will print 0 0 as output bcz we first calling this function befor setvalue() fun thats why we get 0 as default output
            n1.setvalue();

            n1.display();  // this will print 70 90 bcz this fun called after setvalu() fun that why the values get assigned to them  
    }
}
