import java.util.*;

public class A_3q2 {
        public static int maximum(int arr1[], int arr2[], int arr3[]){
        int max1 = arr1[0];
        int max2 = arr2[0];
        int max3 = arr3[0];

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] > max1)
                    max1 = arr1[i];
        }

        for(int i = 0; i<arr2.length; i++){
            if(arr2[i] > max2)
                max2 = arr2[i];
        }

        for(int i = 0; i<arr3.length; i++){
            if(arr3[i] > max3)
                max3 = arr3[i];
        }

        return max1 > max2 ? max1: max2 > max3 ? max2 : max3;
    }
    public static int[] arrWithCommonEle(int []arr1, int[] arr2, int[] arr3, int finalArrSize){
        int k = 0;

        int countArr[] = new int[maximum(arr1, arr2, arr3)+1];
        for(int i = 0; i<countArr.length; i++)
            countArr[i] = 0;

        int finalArr[] = new int[finalArrSize];

        for(int i = 0; i<arr1.length; i++)
            countArr[arr1[i]]++;

        for(int i = 0; i<arr2.length; i++)
            countArr[arr2[i]]++;

        for(int i = 0; i<arr3.length; i++)
            countArr[arr3[i]]++;

        for(int i = 0; i<countArr.length; i++) {
            if(countArr[i] == 3){
                finalArr[k] = i;
                k++;
            }
        }

        for(int i = k; i<finalArr.length; i++)
            finalArr[i] = (int)-1e5;

        return finalArr;
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
        System.out.println("enter the size of array3:");
        int size3=sc.nextInt();
        int [] array3=new int[size3];
        System.out.println("enter the elements of array3:");
        for(int i=0;i<size3;i++){
            array3[i]=sc.nextInt();
        }

        int finalArrSize = size1 < size2 ? size1: size2 < size3 ? size2: size3;
        int finalArr[] = new int[finalArrSize+1];
        finalArr = arrWithCommonEle(array1, array2, array3, finalArrSize);

        System.out.println("Final Array with common elements:");
        for(int i = 0; i<finalArr.length; i++) {
            if(finalArr[i] != (int)-1e5)
                System.out.print(finalArr[i]+" ");
        }
        System.out.println();
        System.out.println("Time complexity of this code is O(max(N, maximum element)\n and space complexity is O(max(N, maximum element)");
        sc.close();
    }
}

    

