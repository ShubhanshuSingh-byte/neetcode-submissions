class Solution {
    public int characterReplacement(String s, int k) {
        int[] ch = new int[26];
        int start=0;
        int end=0;
        int max_freq = Integer.MIN_VALUE;

        for(end=0; end<s.length(); end++){
            ch[s.charAt(end) - 'A']++;
            max_freq = Math.max(max_freq, ch[s.charAt(end)-'A']);

            int len = end-start+1;

            if(len-max_freq>k)
            {
                ch[s.charAt(start) - 'A']--;
                start++;
            }
        }
        return end - start ;
    }
}
