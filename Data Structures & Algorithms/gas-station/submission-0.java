class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int i=0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas<totalCost) return -1;

        int cg=0;
        int si=0;

        for(int i=0; i<gas.length; i++){
            cg += gas[i]-cost[i];

            if(cg<0){
                si = i+1;
                cg=0;
            }
        }

        return si;
    }
}
