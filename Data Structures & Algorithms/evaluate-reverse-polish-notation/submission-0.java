class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(String s: tokens)
        {
            if(s.equals("+")) stack.push(Integer.toString(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop())));
            else if(s.equals("-")) stack.push(Integer.toString(-(Integer.parseInt(stack.pop()) - Integer.parseInt(stack.pop()))));
            else if(s.equals("*")) stack.push(Integer.toString((Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop()))));
            else if(s.equals("/"))
            {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(b/a));
            }

            else stack.push(s);
        }

        return Integer.parseInt(stack.peek());
    }
}
