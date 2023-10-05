import java.util.*;
public class priorityqueue {
    public static int  kthlargest(int array[],int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>(); //pq =name of priority queue;
        for(int i=0;i<k;i++){
            pq.add(array[i]);

        }
        for(int i=k;i<array.length;i++){
            if(pq.peek()<array[i]){
                pq.poll();//for deleting root element 
                pq.add(array[i]);
            }
        }
        return pq.peek();

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
        System.out.println("enter the k for kth largest digit:");
        int k=sc.nextInt();
        int n=kthlargest(array,k);
        System.out.println("kth largest element is:"+n);
        sc.close();

    }
}

