class Solution {
    // TC: O - N , SC: O - 1
    // Tabulation - Space Optimization
    public int fib(int n) {
        if(n<=1) return n; // handling edge case

        int[] dp= new int[n+1]; // Step 1
        int prev1= 1; // step 2
        int prev2= 0;

        for(int i=2; i<= n; i++){ // step 3
            int curr = prev1 + prev2; // step 4
            prev2= prev1;
            prev1= curr;
        }

        return prev1;
    }

    // TC: O - N , SC: O - N
    // Tabulation
    // public int fib(int n) {
    //     if(n<=1) return n; // handling edge case

    //     int[] dp= new int[n+1]; // Step 1
    //     dp[0]= 0; // step 2
    //     dp[1]= 1;

    //     for(int i=2; i<= n; i++){ // step 3
    //         dp[i]= dp[i-1] + dp[i-2]; // step 4
    //     }

    //     return dp[n];
    // }    

    // TC: O - N , SC: O - 2N
    // Memoization
    // public int fib(int n) {
    //     int[] dp= new int[n+1]; // Step 1
    //     Arrays.fill(dp,-1);
    //     return f(n, dp);
    // }

    // public int f(int n, int[] dp){
    //     if(n <= 1){ // Base Case
    //         return n;
    //     }

    //     if(dp[n] != -1){ // step 2
    //         return dp[n];
    //     }
    //     return dp[n]= f(n-1, dp) + f(n-2, dp); // step 3
    // }

    // TC: O 2^N , SC: O N
    //Recurrsion
    // public int fib(int n) {
    //     if(n == 0 || n == 1){ // Base Case
    //         return n;
    //     }
    //     return fib(n-1) + fib(n-2); // Recurrence Relation
    // }
}