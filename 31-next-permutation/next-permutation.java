class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: find pivot
        while (i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;

            // Step 2: find next greater element
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Step 3: swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4: reverse the suffix
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}