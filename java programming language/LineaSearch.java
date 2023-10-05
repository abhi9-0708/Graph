import java.util.*;
//import java.io.*;
public class LineaSearch {
    public static int linearsearch(int array[],int key){
        
        for( int i=0;i<array.length;i++){
            //if(key==key.equals(array[i])){
            //charAt(array[i])
            if(key==array[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]={2,6,9,5,8,10,11,16,19};
        //String menu[]={"dal chawl","chole bhature","samosa","paneer tika"};
       // String menu="Dalchawl";
        System.out.println("Enter the key to search:");
        int key=sc.nextInt();
        int index=linearsearch(array,key);
        if(index==0){
              System.out.println("key not found");
        }
        else{
            System.out.println(key+" found at index "+index);
        }
        
        sc.close();
    }
    
}
