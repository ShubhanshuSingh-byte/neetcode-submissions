class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i: nums)
        {
            if(res.containsKey(i))
            {
                return true;
            }

            else
            {
                res.put(i, 1);
            }
        }

        return false;
    }

}