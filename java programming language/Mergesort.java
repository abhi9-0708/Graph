public class Mergesort {
    public static void sort(int array[],int start,int mid,int end){
        int temp[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(array[i]<array[j]){
                temp[k++]=array[i++];
            }
            else{
                temp[k++]=array[j++];
            }
        }
        while(i<=mid){
            temp[k++]=array[i++];
        }
        while(j<=end){
            temp[k++]=array[j++];
        }
        for(i=start,k=0;k<temp.length;i++,k++){
            array[i]=temp[k];
        }
    }
    public static void mergesort(int array[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(array,start,mid);
        mergesort(array,mid+1,end);
        sort(array,start,mid,end);

    }
    public static void print(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={3,8,5,9,10,11};
        mergesort(array,0,array.length-1);
        print(array);

    }
    
}
