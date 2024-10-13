class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Default result if target is not found

        // Find the starting position
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i; // Found the starting index
                break; // Exit the loop once the first occurrence is found
            }
        }

        // If target was not found, return [-1, -1]
        if (result[0] == -1) {
            return result;
        }

        // Find the ending position
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                result[1] = j; // Found the ending index
                break; // Exit the loop once the last occurrence is found
            }
        }

        return result;
    }
}
