class Solution {
    public int uniquePaths(int m, int n) {
        int prev[] = new int[n+1];
        for(int i=1;i<m+1;i++){
            int cur[] = new int[n+1];
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    cur[j] = 0;
                }else if(i==1 && j==1){
                    cur[j] = 1;
                }else{
                    cur[j] = prev[j] + cur[j-1]; //recur(m-1,n, dp) + recur(m,n-1, dp); 
                }
            }
            prev = cur;
        }
        return prev[n]; //recur(m,n, dp);
    }

}