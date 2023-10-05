import java.util.*;
public class Matrixmult{
    public static int mcm(int array[],int i, int j){
        if(i==j){
            return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int cost1=mcm(array,i,k);
            int cost2=mcm(array,k+1,j);
            int cost3=array[i-1]*array[k]*array[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans,finalcost);    
        }
        return ans;
    }
    public static int matChainMult(int array[],int i,int j,int dp[][]){
        //single matrix  
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int cost1=matChainMult(array,i,k,dp);
            int cost2=matChainMult(array,k+1,j,dp);
            int cost3=array[i-1]*array[k]*array[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans,finalcost);
        }
        return dp[i][j]=ans;
        
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,3};
        int n=array.length;
        //same as single array ;
        int dp[][]=new int [n][n];
        for(int i=0;i<n;i++){
            //in every 1d array filling -1;
            Arrays.fill(dp[i],-1);

        }
        int min=matChainMult(array,1,array.length-1,dp);
        System.out.println("min cost is:"+min);
    }

}