class Solution {
    /**
     * Approach: Using Two Pointers Approach
     *
     * TC: O((3 / 2) x N) ~ O(N)
     * SC: O(N)
     */
    public String reverseVowels(String s) {
        int n = s.length();
        char[] chars = s.toCharArray(); // TC: O(N), SC: O(N)
        int p = 0;     // pointer at the start of String s
        int q = n - 1; // pointer at the end of String s
        while (p < q) { // TC: O(N / 2)
            while (p < q && !isVowel(chars[p])) {
                p++;
            }
            while (p < q && !isVowel(chars[q])) {
                q--;
            }
            // at this point p and q pointer has a vowel so swap them
            if (p < q) {
                char temp = chars[q];
                chars[q] = chars[p];
                chars[p] = temp;
            }
            p++;
            q--;
        }
        return String.valueOf(chars);
    }

    /**
     * TC: O(1)
     * SC: O(1)
     */
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
