public class typecasterror {
    public static void main(String args[])
    {
        byte b=10;
        //byte a=b*2; this line will give error bcz typecast expression
        //byte a=(byte)(b*2);
        int a=b*2;
        
        System.out.print(a);
    }
    
}
