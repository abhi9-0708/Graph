import java.util.*;
public class SelectLinear {
    // public static int selectLinear(int array[],int l,int h,int k){

    // }
    public static int Median(int array[],int l,int h){
        int mid=l+(h-l)/2;
        for(int i=l;i<h-1;i++){//note here from l to h important
            for(int j=i+1;j<h;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("median:"+array[mid]);
        return array[mid];
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            
            System.out.println( array[i]+" ");
        }
    }
    public static int findpos(int carray[],int medofmed){
        int pos=0;
        for(int i=0;i<carray.length;i++){
            if(medofmed==carray[i]){
                pos=i;
                break;
            }    
        }
        System.out.println("position of medofmed is:"+pos);
        return pos;
    }
    public static int partition(int arr[],int l,int u){
        int pivot=arr[l];
        int start=l;
        int end=u;
        while(start<end){
            if(arr[start]<=pivot){
                start++;
            }
            if(arr[end]>pivot){
                end--;
            }
            if(start>end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

            }
        }
        int temp=arr[l];
        arr[l]=arr[u];
        arr[u]=temp;
        return end;

    }
    public static void quicksort(int a[],int l,int u){
        if(l<u){
            int loc=partition(a,l,u);
            quicksort(a,l,loc-1);
            quicksort(a,loc+1,u);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]={5,15,6,9,11,18,4,55,7,66};
        
        int size=array.length;
        System.out.println(size);
        int carray[]=new int[size];//creating a copy of array
        for(int i=0;i<size-1;i++){
            carray[i]=array[i];
        }
        //asking the value of k
        System.out.println("enter the value of k:");
        int k=sc.nextInt();
        int ng=size/5;//ng=no of groups
        int median[]=new int[ng];
        int startindex=0;
        for(int i=0;i<=ng-1;i++){//ng-1 are no of groups with full 5 element
            median[i]=Median(array,startindex,startindex+4);//median of 5 elements
            startindex+=5;
        }
        //median of last group which may be less than 5
        //median[ng]=Median(array,startindex,size);
        printArray(median);
        int medofmed=Median(median,0,ng-1);
        System.out.println("medofmedian:"+medofmed);
        //int i =selectLinear(array,0,size-1,k);
        int pos=findpos(carray,medofmed);
        System.out.println("position of medofmed is:"+pos);
        quicksort(carray,0,carray.length-1);
        printArray(carray);

        sc.close();
    }
    
}
