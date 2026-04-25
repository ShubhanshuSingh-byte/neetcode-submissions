class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        List<Character> st = new Stack<>();
        HashMap<Character, Character> pair = new HashMap<>();
        pair.put(')', '(');
        pair.put('}', '{');
        pair.put(']', '[');

        for(char c: s.toCharArray())
        {
            if(st.size()!=0 && st.getLast() == pair.get(c))
            {
                st.removeLast();
                continue;
            }
            st.add(c);
        }

        return st.size()==0? true: false;
    }
}
