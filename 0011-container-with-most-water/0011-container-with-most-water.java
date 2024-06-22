class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;

        int maxcap=0;

        while(start<end){
            int h=Math.min(height[start],height[end]);
            int width=end-start;

            int currCap=h* width;

            maxcap=Math.max(currCap, maxcap);

            if(height[start]<height[end]){
                start++;

            }else{
                end--;
            }
        }return maxcap;
    }
}