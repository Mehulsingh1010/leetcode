class Solution {
    public int fib(int n) {
       
        if (n <= 1) return n; // Base cases
        return fib(n - 1) + fib(n - 2);
    
    }
}