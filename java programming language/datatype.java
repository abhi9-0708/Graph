public class datatype {
    public static void main(String args[])
    {
        // ther are 8 type of datatype in java
        byte b=8;//range{-128,127} total 256 numberscan be stored
        System.out.println(b);
        //char ch1='ab';  this line will give error..
        char ch='c';//storing characters a,b,c......
        System.out.println(ch);
        boolean var = true;
        System.out.println(var);
        float price = (float)2.5;
        System.out.println(price);
        //reason for lossy conversion is double is bigger than float
        //when we try to fit in a bigger value in a smaller one then this error occur(incompatible error)
        float price1=15.5f;
        System.out.println(price1);
        int number=10;
        System.out.println(number);
        //long->for very large number;
        //double-> for storing very long float value;
        short n=240;
        System.out.println(n);
    }
    
}
