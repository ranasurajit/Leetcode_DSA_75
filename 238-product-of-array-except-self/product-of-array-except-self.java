class Solution {
    /**
     * Approach: Using Array Pre-processing Approach
     *
     * TC: O(3 x N) ~ O(N)
     * SC: O(2 x N) ~ O(N)
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // pre-computing left prefix product array 
        int[] lProd = new int[n]; // SC: O(N)
        lProd[0] = nums[0];
        for (int i = 1; i < n; i++) { // TC: O(N)
            lProd[i] = lProd[i - 1] * nums[i];
        }
        // pre-computing right prefix product array
        int[] rProd = new int[n]; // SC: O(N)
        rProd[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) { // TC: O(N)
            rProd[i] = rProd[i + 1] * nums[i];
        }
        // calculating result
        for (int i = 0; i < n; i++) { // TC: O(N)
            int leftVal = i > 0 ? lProd[i - 1] : 1;
            int rightVal = i < n - 1 ? rProd[i + 1] : 1;
            result[i] = leftVal * rightVal;
        }
        return result;
    }
}
