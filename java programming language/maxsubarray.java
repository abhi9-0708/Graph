//import java.util.*;
public class maxsubarray {
    public static void getsum(int array[]){
        int max_sum=Integer.MIN_VALUE;
        for(int start=0;start<array.length;start++){
            
            for(int end=start;end<array.length;end++){
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(array[k]+" ");
                    sum+=array[k];
                }
                System.out.println("\n"+"sum of subarray :"+sum);
                if(sum>max_sum){
                    max_sum=sum;
                }

            }
        }
        System.out.print("maximum subarray sum is:"+max_sum);
    }
    public static void main(String args[]){
        int array[]={5,8,9,2,1};
        getsum(array);

    }
}
