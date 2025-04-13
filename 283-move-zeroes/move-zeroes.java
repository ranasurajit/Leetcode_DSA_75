class Solution {
    /**
     * Approach I : Two Pass Approach
     *
     * TC: O(2 x N) ~ O(N)
     * SC: O(N)
     */
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // SC: O(N)
        int index = 0;
        for (int i = 0; i < n; i++) { // TC: O(N)
            if (nums[i] != 0) {
                result[index++] = nums[i];
            }
        }
        for (int i = 0; i < n; i++) { // TC: O(N)
            nums[i] = result[i];
        }
    }
}
