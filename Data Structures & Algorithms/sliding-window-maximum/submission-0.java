class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        int max = Integer.MIN_VALUE;
        int max_index = -1;

        for (int i = 0; i < k; i++) 
        {
            if (nums[i] > max) 
            {
                max = nums[i];
                max_index = i;
            }
        }

        res[0] = max;

        for (int i = 1; i <= n - k; i++) 
        {

            int newElementIndex = i + k - 1;
            if (nums[newElementIndex] >= max) 
            {
                max = nums[newElementIndex];
                max_index = newElementIndex;
            }
            else if (max_index < i) 
            {
                max = Integer.MIN_VALUE;

                for (int j = i; j <= newElementIndex; j++) 
                {
                    if (nums[j] > max) 
                    {
                        max = nums[j];
                        max_index = j;
                    }
                }
            }

            res[i] = max;
        }

        return res;
    }
}
