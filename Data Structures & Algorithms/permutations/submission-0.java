class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        dfs(new ArrayList<>(), nums);
        return res;
    }

    private void dfs(List<Integer> ans, int[] nums){
        if(ans.size()==nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int num: nums){
            if(ans.contains(num)){
                continue;
            }

            ans.add(num);
            dfs(ans, nums);
            ans.remove(ans.size()-1);
        }

        }
    }

