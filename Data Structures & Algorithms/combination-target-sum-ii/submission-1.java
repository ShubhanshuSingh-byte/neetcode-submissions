class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, 0, target, nums, new ArrayList<>());
        return list;
    }

    public void dfs(int index, int sum, int target, int[] nums,List<Integer> ans){
        if (sum == target) {
            list.add(new ArrayList<>(ans));
            return;
        }

        if (sum > target || index == nums.length) {
            return;
        }
        ans.add(nums[index]);
        dfs(index + 1, sum + nums[index], target, nums, ans);
        ans.remove(ans.size() - 1);

        while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
        dfs(index + 1, sum, target, nums, ans);
    }
}
