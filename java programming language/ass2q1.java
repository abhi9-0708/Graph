import java.util.Scanner;
public class ass2q1 {
    public static float average(int []num,int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+num[i];
        }
        float tempavg=sum/size;
        return tempavg;


    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=input.nextInt();
        int [] num=new int[size];
        System.out.println("enter the elements of array:");
        for(int i=0;i<size;i++){
            num[i]=input.nextInt();
        }
        System.out.println("The elements of array are:");
        for(int j=0;j<size;j++){
            System.out.println(num[j]);
        }
        float avg=average(num,size);
        System.out.print("Average is"+avg);

        input.close();
    }
    
}
