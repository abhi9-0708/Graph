import java.util.*;
public class typecast{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //float a=25.99f;
        //int b=a;
        float a=25.99f;
        int b= (int) a; 
        System.out.print(b);
        sc.close();
    }
}