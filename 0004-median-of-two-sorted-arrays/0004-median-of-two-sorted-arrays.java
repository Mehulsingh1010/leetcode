class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int combined[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            combined[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            combined[nums1.length + j]=nums2[j];
        }

        Arrays.sort(combined);
        int length=combined.length;
        if (length % 2 == 0) {
            return (combined[length / 2 - 1] + combined[length / 2]) / 2.0;
        } else {
            return combined[length / 2];
        }
    }
}