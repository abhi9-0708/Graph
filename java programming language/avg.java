import java.util.*;
public class avg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 3numbers to find avg:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg =(a+b+c)/3;
        System.out.print("average ="+avg);
        sc.close();
    }
   
}
