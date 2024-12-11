/* we use wrapper class to convert primative datatype(int,char,float,boolean,byte) into non-primitive datatype(string,array) */

class Wrapp
{
    public static void main(String[] args) {
        
    
    System.out.println("this is main function");

    // lets try first paseInt() fun
    int x= Integer.parseInt("1234");

    // lets use valueOf() fun

    Integer e1= Integer.valueOf("101",2);
        // lets make another ref varible/object 
    Integer e2= Integer.valueOf("90");

    // lets use above object to use vauInt() fun

    int y= e1.intValue();
    int z=e2.intValue();

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    
    }

}


// ABOVE WILL APPLY TO OTHE DATATYPES ALSO LIKE DOUBLE