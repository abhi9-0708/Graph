import java.util.*;
public class fact {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no to find factorial:");
        int input=sc.nextInt();
        int result=factorial(input);
        System.out.println("factorial is:"+result);

        sc.close();
    }
    
}
