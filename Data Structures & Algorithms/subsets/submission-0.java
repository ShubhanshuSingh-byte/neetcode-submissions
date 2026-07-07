class Solution {
    int len;
    List<List<Integer>> list;
    public List<List<Integer>> subsets(int[] nums) {
        len = nums.length;
        list = new ArrayList<>();
        dfs(0, new ArrayList<>(), nums);
        return list;
    }

    public void dfs(int index, List<Integer> ans, int[] nums) {
        if(index==len) {
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[index]);
        dfs(index+1, ans, nums);
        ans.remove(ans.size()-1);
        dfs(index+1, ans, nums);
    }
}
