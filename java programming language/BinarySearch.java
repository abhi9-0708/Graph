import java.util.*;
public class BinarySearch {
    public static int search(int array[],int key){
        int start=0;
        int end=array.length-1;
        while(start<=end){//   <= because we want to compare last case when only 1 element is left in array

            int mid=(start+end)/2;
            if(array[mid]==key){
            //System.out.println(key +"found at position "+mid);
            return mid;
            }
            else{
                if(key>array[mid]){//right array
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            
            }
           
        }
         return -1;
    }

    //binary search is used when array is sorted
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int array[]={4,8,11,32,35,44};
        //int size=array.length;
        System.out.println("enter the element to search:");
        int key= sc.nextInt();
        System.out.println(key+"found at position"+search(array,key));
        sc.close();
    }
    
}
