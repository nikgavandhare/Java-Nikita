
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.awt.Color;
import java.awt.Font;
import java.lang.Exception;

// created a digital lock using awt and swing package gi to  make it digital clock

public class Digital_Clock extends JFrame
{
    //lets creat para cunstructor to pass string  object
    Digital_Clock(String s1)
    {
        // return this para to parent /super class
        super(s1);
    }

    // lets create normal cunstructor
    Digital_Clock()
    {
        // itsb an default comstructor 
    }

    // lets take lable 
    JLabel l0,l1,l2,l3,l4;
    SimpleDateFormat f1,f2;

    // lets create componants function to set all vallues
    void Componants()
    {
         //setfont 

         Font t1= new Font("Callibri",Font.BOLD,28);
         Font t2= new Font("Times New Roman",Font.ITALIC,32);
         

        // create ref varible to l1,l2
        l2=new JLabel("Digital Clock");
        l0=new JLabel("Time:");
        l1= new JLabel();
        l3=new JLabel("Day: ");
        l4=new JLabel();

        // set font
        
       l2.setFont(t2);
        l0.setFont(t1);
        l1.setFont(t1) ;
        l3.setFont(t1);
        l4.setFont(t1);

        // set background for l1 and l4
        l1.setForeground(Color.RED);
        l4.setForeground(Color.RED);

        setLayout(null);
        add(l2);
        add(l0);
        add(l1);
        add(l3);
        add(l4);

        // l2 is headline 
        l2.setBounds(370,50,300,50);

        l0.setBounds(100,200,150,50);
        l1.setBounds(300,200,300,50);
        l3.setBounds(100,400,150,50);
        l4.setBounds(300,400,700,50);

        // lets create for time
        // f1 nad f2 are the object of simpldateformate class
        f1=new SimpleDateFormat("hh:mm:ss a");  // here a reprents am and pm in time
        f2=new SimpleDateFormat("EEE, d MMM , yyyy");  // here E represent day in weeks // for thise google simpledataformate in java by oracle and see table

       String time= f1.format(Calendar.getInstance().getTime()); // getisntance() gives u current time  // it returns string dataype so that stored in sstring formate
        l1.setText(time);   //time stored too labble l1
        
        String day= f2.format(Calendar.getInstance().getTime()); // getisntance() gives u current day  // it returns string dataype so that stored in sstring formate
        l4.setText(day);  //set day in l4

        S_time_And_Day();  // its an fun called to acces time and day
    }

// crete time fun to get time and also it will changes every 1 sec 

void S_time_And_Day() 
{

    String time,day;

    while (true)
    {
        // for time
        time= f1.format(Calendar.getInstance().getTime());
        l1.setText(time);  
        
        // for day
        day= f2.format(Calendar.getInstance().getTime());
        l4.setText(day); 
        
        try 
        {
            Thread.sleep(1000);  // 1sec=1000 millisec
        
        } 
         catch (Exception e) 
        {
        
        }
    }
   
        
}

    // its an main fun()
    public static void main(String[] args) 
    {

        // lets create object of class

        Digital_Clock d1=new Digital_Clock("Digital Clock");

        d1.setVisible(true);
        d1.setSize(800,800);  // its size of frame 500X500 pixel
        d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        d1.Componants();  // its fun() called from line no-22
    }
    
}
