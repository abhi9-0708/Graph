import java.util.*;
public class taxcalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the income :");
        Float income=sc.nextFloat();
        Float tax=0f;
        if(income<500000)
        {
            tax=0f; 
        }
        else if(income>=500000 && income<=1000000){
            tax=0.2f*income;
        }
        else{
            tax=0.3f*income;

        }
        System.out.println("tax="+tax);
        sc.close();

    }
    
}
