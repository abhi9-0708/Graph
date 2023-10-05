import java.util.Scanner;

public class A_3q4b {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int testCase = input.nextInt();
        int arr[][] = new int[testCase][100];

        //initialize with infinity:
        for(int i = 0; i<testCase; i++){
            for(int j = 0; j<arr[i].length; j++) {
                arr[i][j] = (int)-1e5;
            }
        }
        System.out.println("Enter the Array input:");
        System.out.println("Enter -1 at the end of Array to start new input.");

        for(int i = 0; i<testCase; i++){
            for(int j = 0; j<arr[i].length; j++){
                int inputNum = input.nextInt();
                if(inputNum == -1)
                    break;
                arr[i][j] = inputNum;
            }
        }

        evenOddCount(arr, testCase);
        input.close();
    }
    public static void evenOddCount(int[][] arr, int n){
        int oddCount = 0;
        int evenCount = 0;

        int totalEven = 0;
        int totalOdd = 0;

        for(int i = 0; i<n; i++){
            evenCount = 0;
            oddCount = 0;
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] != (int)-1e5){
                    if(arr[i][j] % 2 == 0)
                        evenCount++;
                    else
                        oddCount++;
                }
            }
            totalEven += evenCount;
            totalOdd += oddCount;
            System.out.println("Number of Even and Odd elements of testcase: "+i+" are: "+evenCount+" ,"+oddCount);
        }

        System.out.println("Total Even and Odd elements are: "+totalEven+" ,"+totalOdd);
    }

}
    

