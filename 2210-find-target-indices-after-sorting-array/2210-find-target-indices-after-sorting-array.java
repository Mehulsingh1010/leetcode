class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num=0;
        int count=0;
        for(int ele : nums){
            if (ele==target){
                count++;
            }else if(ele<target){
                num++;
            }
        }

        List<Integer> ans= new ArrayList<>();
        while(count>0){
            ans.add(num);
            num++;
            count--;
        
}
        return ans;
    }
}