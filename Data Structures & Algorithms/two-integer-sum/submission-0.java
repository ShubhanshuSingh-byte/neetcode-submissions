class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int cp = target - nums[i];
            if(res.containsKey(cp))
            {
                return new int[]{res.get(cp), i};
            }
            res.put(nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}
