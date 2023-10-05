//import java.util.*;
public class largest {
    public static int largestarray(int array[]){
        int lar=Integer.MIN_VALUE;//- infinity
        for(int i=0;i<array.length;i++){
            if(lar<array[i]){
                lar=array[i];
            }
        }
        return lar;

    }
    public static void smallest_array(int array[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(smallest>array[i]){
                smallest=array[i];
            }
        }
        System.out.println("smallest value is :"+smallest);
    }
    public static void main(String args[]){
       // Scanner sc=new Scanner(System.in);
        int array[]={3,8,9,4,22,11,18};
        smallest_array(array);
        int larg=largestarray(array); 
        System.out.println("largest no in array is :"+larg);


       // sc.close();

    }
    
}
