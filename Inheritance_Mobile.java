
// thisis parent class
class Nokia1
{
    int mic;
    int sound;

    void Show_display()
    {
        System.out.println("\n this will show the display of nokia1 phone");
    }

    void Get_input()
    {
        System.out.println("\n this will get essential inputs for phone");
    }
}

// this is child class

class Nokia2 extends Nokia1
{
    int voltage;
    int plug;

    void set_voltage()
    {
        System.out.println("\n this fun will set voltage for charger of nokia2 phone");
    }

}


public class Inheritance_Mobile {
    

    public static void main(String[] args) 
    {
        
        // lets create object of child class

        Nokia2 n1= new Nokia2();

        n1.Show_display();
        n1.set_voltage();

    }
}
