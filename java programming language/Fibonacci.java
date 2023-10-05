import java.util.*;
public class Fibonacci {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static int topdown(int n,int array[]){
        if(n==0 || n==1){
            array[n]=n;
            return n;
        }

        return (array[n]=topdown(n-1,array)+topdown(n-2,array));   

    }
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n for nth fibonacci:");
        int n=sc.nextInt();
        //int ele=fibonacci(n);
        int array[]=new int[n+1];
        int ele=topdown(n,array);
        //int ele=bottomup(0,n,array);
        System.out.println(n+" th element of fibonacci series is "+ ele);
        sc.close();
    }
    
}
