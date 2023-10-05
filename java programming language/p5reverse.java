import java.util.*;
public class p5reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to reverse :");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            rev=rev*10+digit;
        }
        System.out.print("reverse no is:"+ rev);
        sc.close();
        }
    
}
