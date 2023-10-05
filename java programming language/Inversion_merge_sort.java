import java.util.Scanner;

public class Inversion_merge_sort {


    public static long merge(int[] arr, int l, int mid, int r)
    {
        long inv=0;
        int n1=mid-l+1;
        int n2=r-mid;
        int []a=new int[n1];
        int []b=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+i+1];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                arr[k]=a[i];
                k++;
                i++;
            }
            else {
                arr[k]=b[j];
                inv+=n1-i;
                k++;
                j++;
            }
            
        }
        while(i<n1)
        {
            arr[k]=a[i];
            k++;i++;

        }
        while(j<n2)
        {
            arr[k]=b[j];
            k++;j++;
        }
        return inv;

    }


    public static long merge_sort(int[] arr, int l, int r)
    {   long inv=0;
        if(l<r)
        {   int mid=(l+r)/2;
            inv+=  merge_sort(arr,l,mid);
            inv+=  merge_sort(arr,mid+1,r);
            inv+=  merge(arr,l,mid,r);

        }
        return inv;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The number of inversion ="+merge_sort(arr,0,n-1));

    }
}
