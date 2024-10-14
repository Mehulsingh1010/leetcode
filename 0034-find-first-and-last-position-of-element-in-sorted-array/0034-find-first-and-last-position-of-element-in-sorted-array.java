class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Handle edge case for single-element array
        if (nums.length == 1) {
            if (target == nums[0]) {
                result[0] = 0;
                result[1] = 0;
            }
            return result;
        }

        // Find the first occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        // Find the last occurrence
        for (int y = nums.length - 1; y >= 0; y--) {
            if (nums[y] == target) {
                result[1] = y;
                break;
            }
        }

        return result;
    }
}
