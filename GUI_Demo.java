
import  javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.*;

public class GUI_Demo extends JFrame    // jframe is parent class
{

    
    GUI_Demo(String s)
    {
        super(s);  // constructor with parameter
    }

    GUI_Demo()
    {
        // constructor
    }

    JLabel l1,l2,l3,l4,l0;   // these are the some fun of jframe class   //l0 for add logo
    JButton b1,b2,b3,b4;
    JTextField t1;  
    JPasswordField t2;   // userd to hide typed password in ..... formate

    // create fun for componants
     void componants()
    {
        l1 = new JLabel("Welcome to NTC Company");
        l2 =new JLabel("Username");
        l3= new JLabel("Password"); 
        l4 = new JLabel();
        l0 = new JLabel();

        // lets use cursor 
        Cursor c1= new Cursor(Cursor.HAND_CURSOR);

        // for font create an object
        Font f1=new Font("Times new roman", Font.BOLD, 26);

        Font f2 = new Font("Callibri", Font.BOLD, 18);

        // create object for image
        ImageIcon i = new ImageIcon("C:/Users/akash/Downloads/Home_Page.jpg");
        l0.setIcon(i);

        
        t1= new JTextField();
        t2 = new JPasswordField();

        b1 = new JButton("Login");
        b2= new JButton("Clear");
        b3 = new JButton("Add");   // this button is used if you enter paass and user number the it will return the addition of its
        b4 = new JButton("Autofill"); 

        setLayout(null);
        add(l0);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        // lets add logo 
        l0.setBounds(300, 20, 400, 30);

        // lables l1,l2,l3,l4
        l1.setBounds(300,50,500,30);
        l1.setFont(f1);
        l1.setForeground(Color.RED);

        l2.setBounds(100,200,100,30);
        l2.setFont(f2);
        l2.setForeground(Color.BLUE);

        l3.setBounds(100,350,100,30);
        l3.setFont(f2);
        l3.setForeground(Color.BLUE);
        

        l4.setBounds(350,600,300,30);
        l4.setFont(f2);
        l4.setForeground(Color.GREEN);

        // this is for mouse activity
        l1.addMouseListener(new MouseL());

        // Text t1,t2
        t1.setBounds(350,200,100,30);
        t2.setBounds(350,350,100,30);

        // buttons b1,b2,b3,b4
        b1.setBounds(200,500,100,30);
        b1.setBackground(Color.YELLOW);

        b2.setBounds(500,500,100,30);
        b2.setBackground(Color.YELLOW);

        b3.setBounds(200,550,100,30);
        b3.setBackground(Color.YELLOW);

        b4.setBounds(500,550,100,30);
        b4.setBackground(Color.YELLOW);

        b1.setCursor(c1);    // from line no-37   // used to set hand cursor on login button
        b1.addActionListener(new Login());  // here we use "new login" direct object instead of "Login l1= new Login()"   
        // this line no- 59 is for activating login button after click on it

        b2.addActionListener(new Clear());   // explaination same as b1

        b3.addActionListener(new Add());   // used to add buton

        b4.addActionListener(new Autofill());
        
    }

    // create class for login button to take acction after click on that button
    // using actionlistner class it has function to take action after clicking 

    class Login implements  ActionListener    // class login implements actiolistenr interface 
    {
        public void actionPerformed(ActionEvent e1)
        {
            String s1=t1.getText();
            String s2=t2.getText();

            if(s1.equals("Nikita") && s2.equals("Gaondhare"))
            {
                JOptionPane.showMessageDialog(null,"Login Succuseful.");
                l4.setText("Login Succuseful"); 
                // here l4 lable we have created oabove to show the msg after clicking on login button thats why we use here
            }

            else{

                JOptionPane.showMessageDialog(null,"Login Unsuccuseful");  // its an function to show msg in diaglog box for more detail 
                                                                                                   // google Joptionpane in java to how to use 
                l4.setText("Login Unsuccuseful");
            }
        }
    }


     // create class for clear button to take acction after click on that button
    // using actionlistner class it has function to take action after clicking 

    class Clear implements  ActionListener    // class login implements actiolistenr interface 
    {
        public void actionPerformed(ActionEvent e1)
        {
            t1.setText("");
            t2.setText("");

            // we use t1 and t2 here to set blank test to clear feed 
        }
    }

    // used to autofill pass and username    
    class Autofill implements  ActionListener    // class login implements actiolistenr interface 
    {
        public void actionPerformed(ActionEvent e1)
        {
            t1.setText("Nikita");
            t2.setText("Gaondhare");

            // we use t1 and t2 here to set blank test to clear feed 
        }
    }


    class Add implements ActionListener
    {  
        public void actionPerformed(ActionEvent e1)
        {
        
            try
            {
                int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(t2.getText());   // here we use wrapper class concept to convert string into integer using parsint function

                int c;
                c=a+b;
                l4.setText("Addition is"+ c);
        
            }    
            
            catch(Exception e)
            {
                l4.setText("Please Enter Numbers Only");
            }
        }
                       
    }

    // this class is for mouselistener
    class MouseL implements MouseListener
    {
        public void mouseExited(MouseEvent e)
        {

        }

        
        public void mouseClicked(MouseEvent e) 
        {
            l1.setForeground(Color.BLACK);
        }

        
        public void mousePressed(MouseEvent e)
        {
            
        }

       
        public void mouseReleased(MouseEvent e) 
        {
            l1.setForeground(Color.RED);
        }

        public void mouseEntered(MouseEvent e)
        {
            
        }

        
        
       
    }

    // main function
    public static void main(String[] args)
    {


         GUI_Demo d1= new GUI_Demo("Welcom To NTC Private LTD");  // object of parametric constructor

         d1.setSize(700,700);
         d1.setVisible(true);
         d1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         d1.componants();


        
    }
    
}
