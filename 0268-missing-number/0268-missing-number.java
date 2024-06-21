class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int acsum=(range*(range+1))/2;

        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];
        }
        int ans=acsum-cursum;
        return ans;
        
    }
}