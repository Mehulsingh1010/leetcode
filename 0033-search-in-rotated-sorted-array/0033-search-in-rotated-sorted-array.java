class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        // Binary search logic
        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow
            
            if (nums[mid] == target) {
                return mid; // Target found, return index
            } else if (nums[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        
        return -1; // If target is not found, return -1
    }
}
