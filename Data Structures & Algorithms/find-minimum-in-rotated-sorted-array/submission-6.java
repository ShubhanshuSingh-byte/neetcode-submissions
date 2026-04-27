class Solution {
    public int findMin(int[] nums) {
        int max = nums.length-1;
        int min = 0;

        return bs(nums, min, max);
    }

    public static int bs(int[] nums,int min,int max)
    {
        int b=0;
        while(min<=max)
        {
            int mid = min + (max-min)/2;
            if(mid!=0 && nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }

            else if(mid==0 && nums[mid]<=nums[nums.length-1])
            {
                return nums[mid];
            }

            else
            {
                int a=min;
                min = mid+1;
                if(nums[max]<=nums[mid])
                    b = bs(nums, min, max);
                else{
                    max = mid-1;
                    b = bs(nums, a, max);
                }
            }
        }
        return b;
    }
}
