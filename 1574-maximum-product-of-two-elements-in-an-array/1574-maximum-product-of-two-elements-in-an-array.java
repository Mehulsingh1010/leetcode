class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int x=nums.length;
        int mult=(nums[x-1]-1) * (nums[x-2]-1);
        return mult;
    }
}