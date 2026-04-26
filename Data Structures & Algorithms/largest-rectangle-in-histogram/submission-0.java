class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        for(int pivot = 0; pivot< heights.length; pivot++)
        {
            if(pivot>0 && heights[pivot]==heights[pivot-1]) continue;
            boolean bool = true;
            int i=pivot;
            int j=pivot;
            while(bool)
            {
                bool = false;
                if(j<heights.length-1 && heights[j+1]>=heights[pivot])
                {
                    j++;
                    bool=true;
                }
                if(i>0 && heights[i-1]>=heights[pivot])
                {
                    i--;
                    bool=true;
                }
            }

            area = Math.max(area, heights[pivot]*(j-i+1));
        }


        return area;
    }
}
