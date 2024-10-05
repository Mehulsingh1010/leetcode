class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Update second largest
                max1 = num; // Update largest
            } else if (num > max2) {
                max2 = num; // Update second largest
            }
        }

        // The maximum product is (max1 - 1) * (max2 - 1)
        return (max1 - 1) * (max2 - 1);
    }
}
