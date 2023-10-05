
import java.util.*;
public class A_3q1{
    public static void print(int [] array,int size){
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
            
        }
    }
    public static void mergesort(int [] array1,int size1,int [] array2,int size2)
    {
        
        int array[] = new int[size1+size2];
        int i = 0, j = 0;
      
            
        int k = 0;
        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                array[k++] = array1[i];
                     i++;
                }
            else {
                array[k++] = array2[j];
                     j++;
                }
                
            }
            while (i < size1) {
                 array[k] = array1[i];
                 i++;
                 k++;
             }
            while (j < size2) {
                 array[k] = array2[j];
                 j++;
                 k++;
            }
            System.out.println("the merged array is:");
            print(array,size1+size2);
            
        }
         
        
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array1:");
        int size1=sc.nextInt();
        int [] array1=new int[size1];
        System.out.println("enter the elements of array1:");
        for(int i=0;i<size1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("enter the size of array2:");
        int size2=sc.nextInt();
        int [] array2=new int[size2];
        System.out.println("enter the elements of array2:");
        for(int i=0;i<size2;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println("the elements of array1 are:");
        print(array1,size1);
        System.out.println("the elements of array2 are:");
        print(array2,size2);
        sc.close();
        mergesort(array1,size1,array2,size2);

    }
}
    

