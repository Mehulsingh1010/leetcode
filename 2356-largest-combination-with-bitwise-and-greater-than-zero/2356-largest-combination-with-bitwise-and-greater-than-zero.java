class Solution {
    public int largestCombination(int[] candidates) {
        int maxCount = 0;

        // Check each bit position up to 30 (since integers are 32-bit, this is enough for numbers up to 10^7)
        for (int bit = 0; bit < 30; bit++) {
            int count = 0;

            // Count how many numbers have a 1 in the current bit position
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Update maxCount with the largest count found for any bit position
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
