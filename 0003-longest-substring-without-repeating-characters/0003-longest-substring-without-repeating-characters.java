class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is already in the current substring
            int index = sb.indexOf(String.valueOf(currentChar));
            if (index != -1) {
                // Remove all characters up to and including the first occurrence of the duplicate character
                sb.delete(0, index + 1);
            }

            // Append the current character to the StringBuilder
            sb.append(currentChar);

            // Update the maximum length found so far
            maxLength = Math.max(maxLength, sb.length());
        }

        return maxLength;
    }
}
