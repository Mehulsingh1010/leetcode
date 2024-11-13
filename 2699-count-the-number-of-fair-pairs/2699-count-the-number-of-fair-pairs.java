class Solution {
    // Counts the number of 'fair' pairs in the array, where a pair is considered fair 
    // if the sum of its elements is between 'lower' and 'upper' (inclusive).
    public long countFairPairs(int[] nums, int lower, int upper) {
        // Sort the array to enable binary search
        Arrays.sort(nums);
        long count = 0; // Initialize count of fair pairs
        int n = nums.length;
      
        // Iterate over each element in the array
        for (int i = 0; i < n; ++i) {
            // Find the left boundary for the fair sum range
            int leftBoundaryIndex = binarySearch(nums, lower - nums[i], i + 1);
          
            // Find the right boundary for the fair sum range
            int rightBoundaryIndex = binarySearch(nums, upper - nums[i] + 1, i + 1);
          
            // Calculate the number of fair pairs with the current element
            count += rightBoundaryIndex - leftBoundaryIndex;
        }
      
        // Return the total count of fair pairs
        return count;
    }

    // Performs a binary search to find the index of the smallest number in 'nums' 
    // starting from 'startIdx' that is greater or equal to 'target'.
    private int binarySearch(int[] nums, int target, int startIdx) {
        int endIdx = nums.length; // Sets the end index of the search range
      
        // Continue the loop until the search range is exhausted
        while (startIdx < endIdx) {
            int midIdx = (startIdx + endIdx) >> 1; // Calculate the mid index
            // If the mid element is greater or equal to target,
            // we need to continue in the left part of the array
            if (nums[midIdx] >= target) {
                endIdx = midIdx;
            } else {
                // Otherwise, continue in the right part
                startIdx = midIdx + 1;
            }
        }
      
        // Return the start index which is the index of the smallest
        // number greater or equal to 'target'.
        return startIdx;
    }
}
