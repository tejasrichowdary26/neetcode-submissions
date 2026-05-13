class Solution {
    public int[] productExceptSelf(int[] nums) {

        int k = nums.length;
        int[] output = new int[k];

        int window = 1;
        int zeroCount = 0;

        // Count zeros
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        // If more than one zero
        if (zeroCount > 1) {
            return output; // all elements will be 0
        }

        // If exactly one zero
        if (zeroCount == 1) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    window = window * nums[i];
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    output[i] = window;
                } else {
                    output[i] = 0;
                }
            }

        } else {

            // No zeros
            for (int i = 0; i < nums.length; i++) {
                window = window * nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                output[i] = window / nums[i];
            }
        }

        return output;
    }

}
