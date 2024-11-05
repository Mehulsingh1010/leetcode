class Solution {
    public int minChanges(String s) {
        int changes = 0;

        // Traverse every pair in the string
        for (int i = 0; i < s.length(); i += 2) {
            // If two adjacent characters in the pair are different, we need one change
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }
        }

        return changes;
    }
}
