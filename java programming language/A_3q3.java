import java.util.*;
public class A_3q3 {
    public static void movezero(int []array,int size){
        int non_zero_index=0;
        for(int i=0;i<size;i++){
            if (array[i] !=0){
                array[non_zero_index]=array[i];
                non_zero_index++;
            }
        }
        while(non_zero_index<size){
            array[non_zero_index]=0;
            non_zero_index++;
        }

        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        int [] array=new int[size];
        System.out.println("enter the elements of array:");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        movezero(array,size);
        System.out.println("enter the elements of array:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }

        
        sc.close();

    }
    
}
