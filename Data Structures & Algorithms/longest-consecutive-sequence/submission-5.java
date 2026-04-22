class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1,current =1;

        if( nums.length == 0 ) return 0; 

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]-1==nums[i-1])
                current++;

            else if(nums[i]==nums[i-1])
            {
                continue;
            }

            else{
                max = Math.max(max, current);
                current =1;
            }

        }
        return Math.max(max, current);
    }
}
