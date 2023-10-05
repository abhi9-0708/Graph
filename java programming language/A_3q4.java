import java.util.Scanner;
public class A_3q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        int testcase[][] = new int[n][];
        System.out.println("Enter the size and  element of all test cases");
        //input2:
        int sum;
        for(int i=0; i<n; i++){
            int size = sc.nextInt();
            testcase[i] =new int[size];
            for(int j=0; j<size; j++){
                testcase[i][j] = sc.nextInt();
            }
        }
        //finding odd and even in test case
        int totalEven=0;
        int totalOdd=0;


        for(int i=0; i<n; i++){
            int oddCount=0;
            int evenCount=0;
            for(int num:testcase[i]){
                if(num%2==0){
                    evenCount++;
                }
                else{
                    oddCount++;
                }
            }
            System.out.println("In the testcase"+(i+1)+"odds are :"+oddCount+",evens are :"+evenCount);
            totalOdd =totalOdd+oddCount;
            totalEven=totalEven+evenCount;
        }
        System.out.println("total overall even are :"+totalEven+" , total overall odds are :"+totalOdd);
        sc.close();

    }
}