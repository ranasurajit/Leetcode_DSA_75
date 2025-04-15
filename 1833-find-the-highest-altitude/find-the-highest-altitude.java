class Solution {
    /**
     * Approach : Using Array Pre-processing Approach
     * 
     * TC: O(N)
     * SC: O(1)
     */
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxHeight = 0;
        int gainedHeight = 0;
        for (int i = 0; i < n; i++) { // TC: O(N)
            gainedHeight += gain[i];
            maxHeight = Math.max(maxHeight, gainedHeight);
        }
        return maxHeight;
    }
}
