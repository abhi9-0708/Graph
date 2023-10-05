import java.util.*;
public class evenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out .print("enter no to check even or odd:");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("even no");

        }
        else{
            System.out.println("odd number");
        }
        sc.close();
    }
    
}
