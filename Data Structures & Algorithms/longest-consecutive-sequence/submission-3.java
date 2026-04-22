class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        List<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        if(nums.length==0) return 0;

        stack.add(nums[0]);

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]-1==nums[i-1]) stack.add(nums[i]);

            else if(nums[i]==nums[i-1]) continue;

            else{
                if(res.size()<stack.size()) 
                {
                    res.clear();
                    res.addAll(stack);
                }
                stack.clear();
                stack.add(nums[i]);
            }
        }

        if(res.size()<stack.size())
        {
            res.clear();
            res.addAll(stack);
        }


        return res.size();
    }
}
