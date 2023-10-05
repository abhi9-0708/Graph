public class typepromotion {
    public static void main(String args[])
    {
        char a='a';
        char b='b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);
        //in expression b-a char b and char a is converted into integer data type first then b-a is calculated.
         System.out.println(a);
         //here no typecast is uded so a will be printed as it is

    }
    
}
