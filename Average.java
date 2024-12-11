public class Average {
    

    public static void main(String[] args) {
            // here args is referece of string datatype in main fun we can assign value to args at the runtime (while compiling code)

        int i;
        int s=0;

        for(i=0;i<args.length;i++)
        {
            s = s +  Integer.parseInt(args[i]);
                    // here parseint() fun usede to convert args string to int type 
        }


        System.out.println("Average is "+ s/args.length);
    }
}
