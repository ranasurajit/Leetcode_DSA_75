class Solution {
    /**
     * Approach : Using Two Pointers Approach
     *
     * TC: O(M + N)
     * SC: O(M + N)
     */
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int p = 0; // pointer at beginning of String 'word1'
        int q = 0; // pointer at beginning of String 'word2'
        StringBuilder sb = new StringBuilder();
        while (p < m && q < n) {
            sb.append(word1.charAt(p));
            p++;
            sb.append(word2.charAt(q));
            q++;
        }
        while (p < m) {
            sb.append(word1.charAt(p));
            p++;
        }
        while (q < n) {
            sb.append(word2.charAt(q));
            q++;
        }
        return sb.toString();
    }
}
