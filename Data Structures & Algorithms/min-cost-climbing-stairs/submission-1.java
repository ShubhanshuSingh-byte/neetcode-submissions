class Solution {
    int[] arr;
    public int minCostClimbingStairs(int[] cost) {
        arr = new int[cost.length+1];   
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;
        arr[1] = 0;     
        dp(2, cost);
        return arr[arr.length-1];
    }

    public void dp(int index, int[] cost){
        if(index>=arr.length){
            return;
        }

        arr[index] = Math.min(arr[index-1]+cost[index-1], arr[index-2]+cost[index-2]);
        dp(index+1, cost);
    }
}
