class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int result[]= new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }
        
        for(int i=0;i<nums.length *2;i++){
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < n) stack.push(i);
        }
        return result;
    }
}