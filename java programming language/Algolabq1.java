import java.util.*;
public class Algolabq1 {
    public static int search(int array[],int key){
        int start=0;
        int end=array.length-1;
        while(start<=end){

            int mid=(start+end)/2;
            if(array[mid]==key){
            
            return mid;
            }
            else{
                if(key>array[mid]){
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
    public static int partition(int array[][],int row,int col){
        Scanner sc= new Scanner(System.in);
        
        //int size=array.length;
        System.out.println("enter the element to search:");
        int key= sc.nextInt();
        int startindex=0;
        for(int i=startindex;i<startindex+col;i++){
            int arr[]=new int[col];
            arr[i]=array[row][i];
            int ans=search(arr,key);
            if(ans!=-1){
                System.out.print("key found at position:"+ans);
            }
            startindex+=col;
        }
        System.out.println(key+"found at position"+search(array,key));
        sc.close();
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("enter the elements of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int row=matrix.length;
        int col=matrix.length;
        partition(matrix,row,col);

    }
}
    

