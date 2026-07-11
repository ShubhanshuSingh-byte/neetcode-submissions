class Solution {
    int ways=0;
    int[] mem;
    public int climbStairs(int n) {
        mem = new int[n];
        Arrays.fill(mem, -1);
        
        return dfs(0, n);
    }

    public int dfs(int count, int n){
        if(count==n){
            return 1;
        }

        if(count>n){
            return 0;
        }

        if(mem[count]!=-1){
            return mem[count];
        }

        mem[count] = dfs(count+1, n) + dfs(count+2, n);
        return mem[count];
    }
}
