import java.util.ArrayList;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < m && j < n) { 
            if (nums1[i] < nums2[j]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }
        while (i < m) {
            result.add(nums1[i]);
            i++;
        }
        while (j < n) {
            result.add(nums2[j]);
            j++;
        }
        for (int num : result) {
            nums1[k++] = num;  
        }
    }
}
