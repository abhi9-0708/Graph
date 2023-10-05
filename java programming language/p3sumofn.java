import java.util.*;
public class p3sumofn {
    public static  void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the limit");
        int input=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=input){
            sum=sum+i;
            i++;
        }
        System.out.print("total sum="+sum);
        sc.close();

    }
    
}
