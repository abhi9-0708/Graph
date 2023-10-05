//import java.util.*;
public class inversion {
    
    public static int merge(int array[],int l,int mid,int h){
        int cinv=0;
        int temp[]=new int[h-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<= mid && j<= h ){
            if(array[i]<array[j]){
                temp[k++]=array[i++];
            }
            else{
                temp[k++]=array[j++];
                cinv=mid+i-1;
            }
        }
        while(i<=mid){
            temp[k++]=array[i++];
        }
        while(j<=h){
            temp[k++]=array[j++];
        }
        for(k=0,i=l;k<temp.length;k++,i++){
            array[i]=temp[k];
        }
        return cinv;


    }
    public static int mergesort(int array[],int l,int h){
        int inv=0;
        if(l>=h){
            return 0;
        }
        int mid=l+(h-l)/2;
        inv+=mergesort(array,l,mid);
        inv+=mergesort(array,mid+1,h);
        inv+=merge(array,l,mid,h);

        return inv;
    }
    public static void main(String args[]){

        int array[]={2,5,3,8};
        int tinv=mergesort(array,0,array.length-1);
        System.out.println("total inversion in array is:"+tinv);
    }
    
}
