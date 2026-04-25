class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> occ = new HashMap<>();
        String sb = "";
        int left =0;
        int max = 0;

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if (occ.containsKey(ch) && occ.get(ch) >= left) {
                left = occ.get(ch) + 1;
                sb = s.substring(left, i);
            }

            sb += ch;
            occ.put(ch, i);

            max = Math.max(max, sb.length());
        }
        System.out.println(sb);
        return max;
    }
}
