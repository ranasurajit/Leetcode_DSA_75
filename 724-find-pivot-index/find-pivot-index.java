class Solution {
    /**
     * Approach : Using Array Pre-processing
     *
     * TC: O(2 x N) ~ O(N)
     * SC: O(N)
     */
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        // pre-computing prefix sum from right to left
        int[] rightSum = new int[n]; // SC: O(N)
        rightSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) { // TC: O(N)
            rightSum[i] = nums[i] + rightSum[i + 1];
        }
        System.out.println(Arrays.toString(rightSum));
        int pivotIdx = -1;
        int leftSum = 0;
        for (int i = 0; i < n; i++) { // TC: O(N)
            if (i < n - 1 && leftSum == rightSum[i + 1]) {
                pivotIdx = i;
                break;
            } else if (i == n - 1 && leftSum == 0) {
                pivotIdx = i;
                break;
            }
            leftSum += nums[i];
        }
        return pivotIdx;
    }
}
