class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            int index = sb.indexOf(String.valueOf(currentChar));
            if (index != -1) {
                sb.delete(0, index + 1);
            }

            sb.append(currentChar);

            maxLength = Math.max(maxLength, sb.length());
        }

        return maxLength;
    }
}
