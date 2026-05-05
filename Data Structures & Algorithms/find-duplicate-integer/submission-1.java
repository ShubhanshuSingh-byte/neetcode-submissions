class Solution {
    public int findDuplicate(int[] nums) {
        for(int i: nums){
            int val = Math.abs(i);
            int idx = val-1;
            if(nums[idx] < 0) return val;
            nums[idx] *= -1;
        }
        return -1;
    }
}
