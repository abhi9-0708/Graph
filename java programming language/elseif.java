import java.util.*;
public class elseif {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.print("adult");
        }
        //else if save our run time if statement is true it skip all other statement
        //ie jha true condn mila usk aage ke condition skip kr do;
        else if(age>13 && age<18){
            System.out.print("teenager");
        }
        else{
            System.out.print("child");
        }
        sc.close();

    }
    
}
