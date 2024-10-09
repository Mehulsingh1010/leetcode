class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1; // Handle edge case

        int maxIndex = 0; // Pointer for the index of the maximum value
        int maxValue = nums[0]; // Initialize maxValue

        // First, find the maximum value and its index
        for (int i = 1; i < n; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i; // Update maxIndex
            }
        }

        // Now check if the maxValue is at least twice the value of all other numbers
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && maxValue < 2 * nums[i]) {
                return -1; // Not dominant
            }
        }

        return maxIndex; // Return the index of the dominant value
    }
}
