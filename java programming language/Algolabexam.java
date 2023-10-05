import java.util.*;
public class Algolabexam{
    public static void display(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int lis(int array1[],int array2[],int n,int m,int d){
        //base case
        if(n==0||m==0){
            return 0;
        }
        
        //same case
         if(array1[n-1]==array2[m-1]){
        
            return lis(array1,array2,n-1,m-1,d)+1;
         }
         else{
             int ans1=lis(array1,array2,n-1,m,d);
             int ans2= lis(array1,array2,n,m-1,d);
             return Math.max(ans1,ans2);
        }
         
    }
    public static int lis(int array1[],int array2[],int n,int m,int d,ArrayList<Integer> res){
        //base case
        if(n==0||m==0){
            return 0;
        }
        
        //same case
         if(array1[n-1]==array2[m-1]){
            res.add(array1[n-1]);
            if(res.size()>=2){
                if(array1[n-1]-res.get(res.size()-1)>=d){
                    res.remove(res.size());
                
                }

            }    
            return lis(array1,array2,n-1,m-1,d,res)+1;
         }
         else{
             int ans1=lis(array1,array2,n-1,m,d,res);
             int ans2= lis(array1,array2,n,m-1,d,res);
             return Math.max(ans1,ans2);
        }
         
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of d");
        int d=sc.nextInt();
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        int array1[]=new int[size];
        System.out.println("enter the elements of array:");
        for(int i=0;i<size;i++){
            array1[i]=sc.nextInt();
        }
        display(array1);
        //copying the elements from array1 to array 2
        int array2[]=new int[size];
        for(int i=0;i<size;i++){
            array2[i]=array1[i];
        }
        Arrays.sort(array2);
        System.out.println();
        display(array2);
        ArrayList<Integer>res=new ArrayList<>();
        int ans=lis(array1,array2,array1.length,array2.length,d,res);
        System.out.println();
        System.out.println("longest increasing sequence length is :"+(ans));

        sc.close();

    }
}