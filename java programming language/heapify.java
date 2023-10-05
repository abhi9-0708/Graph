import java.util.*;
//check code their is some error inthis code
public class heapify {
    public static void swap(int a,int b){
         int temp=a;
            a=b;
            b=temp;
        
    }
    public static void maxheapify(int array[],int size,int i){
        int largest=i;
        int leftchild=2*i+1;
        int rightchild=2*largest+2;
        if(leftchild<size && array[leftchild]<array[largest]){
            largest=leftchild;
        }
        if(rightchild<size && array[rightchild]<array[largest]){
            largest=rightchild;
        }
        if(largest!=i){
            int temp=array[i];
            array[i]=array[largest];
            array[largest]=temp;
            maxheapify(array,size,largest);

        }

    }
    public static void heapsort(int array[],int size){
        for(int i=size/2-1;i>=0;i--){
           maxheapify(array,size,i);
        }
        for(int i=size-1;i>=0;i--){
            int temp=array[i];
            array[i]=array[0];
            array[0]=temp;
            maxheapify(array,size,0);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter the elements of array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        heapsort(array,size);
        sc.close();
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
