class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        int i=0;
        while(i<temperatures.length)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int prevIndex = stack.pop();
                res[prevIndex] = i-prevIndex;
            }
            stack.add(i);
            i++;
        }
        System.out.println(stack);
        return res;
    }
}
