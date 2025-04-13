class Solution {
    /**
     * Approach II : Two Pointers Approach
     *
     * TC: O(N)
     * SC: O(1)
     */
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int idxZero = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) { // TC: O(N)
            if (nums[i] == 0) {
                idx++;
            } else {
                // swap elements at indices idx and idxZero
                int temp = nums[idxZero];
                nums[idxZero] = nums[idx];
                nums[idx] = temp;
                idxZero++;
                idx++;
            }
        }
    }

    /**
     * Approach I : Two Pass Approach
     *
     * TC: O(2 x N) ~ O(N)
     * SC: O(N)
     */
    public void moveZeroesApproachI(int[] nums) {
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
