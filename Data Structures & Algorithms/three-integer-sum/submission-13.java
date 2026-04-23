class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            if (nums[i] > 0) break;

            if ( i>0 && nums[i]==nums[i-1]) continue;
            int k=i+1;
            int j=nums.length-1;
            while(k<j)
            {
                if( (nums[k] + nums[j] + nums[i]) == 0 )
                {
                    List<Integer> l1 = Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(l1);
                    while(k<j && nums[k+1]==nums[k]) k++; 
                    while(k<j && nums[j]==nums[j-1]) j--;
                    k++; j--;
                }

                else if( nums[k] + nums[j] + nums[i] < 0 ) k++;

                else j--;
            }
        }
        return res;
    }
}
