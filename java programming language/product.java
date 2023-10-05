import java.util.*;
public class product {
    public static int product1(int a, int b){
        int prod =a*b;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter nos to find product:");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int p=product1(input1,input2);
        System.out.println("the product is:"+p);
        sc.close();

    }
    
}
