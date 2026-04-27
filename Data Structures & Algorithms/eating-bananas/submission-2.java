class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int time=Integer.MAX_VALUE;

        int max=0;
        int min=1;
        for(int i: piles) if(i>max) max = i;

        if(h==piles.length) return max;

        int ans = max;
        while(min<=max)
        {
            int mid = min + (max-min)/2;
            time = check(piles, h, mid);
            if(time<=h)
            {
                ans = mid;
                max = mid-1;
            }

            else
            {
                min = mid+1;
            }
        }

        return ans;
    }

    public static int check(int[] piles, int h, int k)
    {
        int time=0;
        for(int i: piles)
        {
            if(i%k==0)
            {
                time += i/k;
            }
            else{
                time += i/k+1;
            }
        }

        return time;
    }
}
