import java.util.*;
public class arraycc {
    public static void update(int array[],int nonchangeable){
        nonchangeable=10;
        for(int i=0;i<array.length;i++){
            array[i]=array[i]+1;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int nonchangeable=5;
        
        int marks[]={1,4,7,8};
        int size=marks.length;
        update(marks,nonchangeable);
        sc.close();
        System.out.println("updated array is:");
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        System.out.println(nonchangeable);
    }   
}
