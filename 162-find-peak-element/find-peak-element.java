class Solution {
    public int findPeakElement(int[] nums) {
         int n = nums.length;
        int low =0;
        int high = n-1;
        while (low < high){
            int mid = (low+high)/2;
             if(nums[mid] > nums[mid+1]){
                high = mid;  //peak on left side
             }
             else {
                low = mid+1; //peak on the eright side
             }
        }
        return low;
    }
}