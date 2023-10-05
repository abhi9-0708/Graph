import java.util.*;
public class manyinput {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println("enter the number");
        int number=sc.nextInt();
        System.out.println(number);
        System.out.println("enter the floatnum");
        Float price=sc.nextFloat();
        System.out.println(price);
        sc.close();

    }
    
}
