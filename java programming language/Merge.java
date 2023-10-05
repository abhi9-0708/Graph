public class Merge {
    public static void mergesort(int array[],int start,int end){
        if(start>=end){//note(start==end) wrong
            return;
        }
        int mid=start+((end-start)/2) ;//(start+end)/2
        mergesort(array,start,mid);
        mergesort(array,mid+1,end);
        merge(array,start,mid,end);
        
    }
    public static void merge(int array[],int start,int mid,int end){
        int temp[]=new int[end-start+1];//note here +1 bcz suppose left part(0,3)=4 time
        //right part (4,6)=3 time then total 7 time //(6-0)=6 ie from 0 to 5 only;
        int i=start;// for iterating left part
        int j=mid+1;//for iterating right part
        int k=0;//iterator for temp array
        //comparing i of first nd j of 2nd subarray nd putting into 3rd temp array
        while(i<=mid && j<=end){
            if(array[i]<array[j]){
                temp[k++]=array[i++];
            }
            else{
                temp[k++]=array[j++];
            }
           
        }
        
        //left part 
        while(i<=mid){
            temp[k++]=array[i++];
        }
        //right part
        while(j<=end){
            temp[k++]=array[j++];
        }
        //copy the elements to original array
        for(k=0,i=start;k<temp.length;k++,i++){
            array[i]=temp[k];
        }
        
    }
    public static void print(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[]={4,9,6,11,22,16,18,15};
        int end=array.length-1;
        
        mergesort(array,0,end);
        print(array);
    }
    
}
