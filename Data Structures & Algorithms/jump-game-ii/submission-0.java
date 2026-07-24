class Solution {
    public int jump(int[] nums) {
        int steps =0;
        int l=0, r=0;

        while(r<nums.length-1){
            int dist = 0;
            for(int i=l; i<r+1; i++){
                dist = Math.max(dist, i + nums[i]);
            }
            l = r+1;
            r = dist;
            steps++;
        }
        return steps;
    }
}
