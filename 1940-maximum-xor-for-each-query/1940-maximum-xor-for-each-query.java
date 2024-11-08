class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int maxVal = (1 << maximumBit) - 1; // Maximum k value with maximumBit bits
        int[] result = new int[n];
        
        // Step 1: Compute xor of all elements in nums
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }
        
        // Step 2: Process each query in reverse
        for (int i = 0; i < n; i++) {
            // Find the k that maximizes the XOR
            result[i] = maxVal ^ xorAll;
            
            // Update xorAll by removing the last element in the current nums array
            xorAll ^= nums[n - 1 - i];
        }
        
        return result;
    }
}
