class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> occ = new HashMap<>();
        int left =0;
        int max = 0;

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if (occ.containsKey(ch)) {
                left = Math.max(left,occ.get(ch) + 1);
            }

            occ.put(ch, i);

            max = Math.max(max, i-left+1);
        }
        return max;
    }
}
