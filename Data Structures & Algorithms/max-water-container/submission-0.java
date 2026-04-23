class Solution {
    public static int maxArea(int[] nums) {

        int i=0; 
        int j=nums.length-1;

        int res = (j-i)*(Math.min(nums[i], nums[j]));

        while (i<j) {
            if(nums[i]<nums[j]) i++;
            else j--;

            res = Math.max((j-i)*(Math.min(nums[i], nums[j])), res);
        }

        return res;
    }
}
