import java.util.*;
public class largestof2no{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no1:");
        int a=sc.nextInt();
        System.out.print("enter no2:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("largest no="+ a);
        }
        else{
            System.out.println("largest no="+ b);
        }
        sc.close();

    }
}