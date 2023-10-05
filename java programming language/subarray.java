//import java.util.*;
//print all subarray of an array
public class subarray {
    public static void getsubarray(int array[]){
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=i;j<array.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println(); 
            }
            System.out.println();  
        }
    }
    public static void main(String args[]){
        int array[]={6,9,10,13,22,45,18};
        getsubarray(array);
    }
    
}
