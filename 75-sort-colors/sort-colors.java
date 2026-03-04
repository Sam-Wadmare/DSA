class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int count0=0;
        int count1=0;
        int count2=0;

        for(int count: nums){
            if (count == 0){
                count0++;
            }
            else if(count == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        int index = 0;
        while(count0-- > 0){
            nums[index++]=0;
        }
        while(count1-- > 0){
            nums[index++]=1;
        }
        while(count2-- > 0){
            nums[index++]=2;
        }
        for(int num : nums){
            System.out.println(num);
        }
    }
}