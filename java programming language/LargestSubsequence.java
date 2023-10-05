import java.util.*;
public class LargestSubsequence {
    public static int lcs(String str1,String str2,int n,int m){
        //base case
        if(n==0||m==0){
            return 0;
        }
        //same case
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return lcs(str1,str2,n-1,m-1)+1;
        }
        else{
            int ans1=lcs(str1,str2,n-1,m);
            int ans2= lcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }
    public static int lcsdp(String str1,String str2,int n,int m,int dp[][]){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        else{

            if(str1.charAt(n-1)==str2.charAt(m-1)){
                //System.out.print("if ok");
                return dp[n][m]=lcsdp(str1,str2,n-1,m-1,dp)+1;
            } 
            else{
                //System.out.print("else  ok");
                int ans1=lcsdp(str1,str2,n-1,m,dp);
                int ans2=lcsdp(str1,str2,n,m-1,dp);
                return dp[n][m]=Math.max(ans1,ans2);
            }
        }

    }
    public static void main (String args[]){
        String str1="abcde";
        String str2="abc";
        
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);      
        }
        int ans=lcsdp(str1,str2,n,m,dp);
        System.out.print(ans);

    }
    
}
