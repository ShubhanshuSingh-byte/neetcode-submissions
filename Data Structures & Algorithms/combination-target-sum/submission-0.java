class Solution {
    List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        list = new ArrayList<>();
        dfs(0, 0, target, nums, new ArrayList<>());
        return list;
    }

    public void dfs(int index, int sum, int target, int[] nums,List<Integer> ans){
        if(index==nums.length) return;
        if(sum>target){
            return;
        }

        if(sum==target){
            list.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[index]);
        dfs(index, sum+nums[index], target, nums, ans);
        ans.remove(ans.size()-1);
        dfs(index+1, sum, target, nums, ans);
    }
}
