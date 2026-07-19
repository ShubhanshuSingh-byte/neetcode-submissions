class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] arr1 = new int[nums.length-1];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = nums[i];
        }

        int[] arr2 = new int[nums.length-1];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = nums[i+1];
        }

        return Math.max(rob1(arr1), rob1(arr2));

    }

    public int rob1(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i< dp.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[dp.length-1];
    }
}
