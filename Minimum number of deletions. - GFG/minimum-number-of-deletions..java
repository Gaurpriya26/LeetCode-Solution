//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minDeletions(String s, int m)
    {
        // code here 
        String s2= "";
        for(char i=0; i<m;i++){
            s2= s.charAt(i)+s2;
        }
        int[][] dp= new int[m+1][m+1];
       for(int i=1;i<m+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)== s2.charAt(j-1))
                dp[i][j]=1+ dp[i-1][j-1];
                else
                dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return m-dp[m][m];

    }
    }
