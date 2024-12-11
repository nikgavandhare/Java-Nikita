public class ExceptionH1 {

    public static void main(String[] args) {

        int cb=10000;
        int wb=16000;

        try
    {
        if(cb<wb)
        {
            throw  new ArithmeticException("Insufficiant Balance");
        }
        cb= cb-wb;
        System.out.println("Transaction Successful");
        System.out.println("current balance is "+ cb);
    }
        
    catch( ArithmeticException a1)
    {
        System.out.println(a1.getMessage());
        System.out.println("current balance is "+ cb);
    }
    }
    
}
