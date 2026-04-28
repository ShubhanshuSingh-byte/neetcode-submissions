class Solution 
{
    public int carFleet(int target, int[] position, int[] speed) 
    {
        int fleet = 1;
        double pre = 0;
        //works for logic with no car at same position with different speed
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<position.length; i++)
        {
            map.put(position[i], i);
        }

        Arrays.sort(position);
        pre = (target-position[position.length-1])/speed[map.get(position[position.length-1])];
        for(int i=position.length-2;i>=0;i--)
        {
            double a = (double)(target - position[i]) / speed[map.get(position[i])];
            if(a>pre)
            {
                pre = a;
                fleet++;
            }

        }
            
        return fleet;
    }
}
