class Solution {
    public static String minWindow(String s, String t) {
        int[] freq = new int[128];
        int min = Integer.MAX_VALUE;
        int index=0;
        int req = 0;

        if(s.length()<t.length()) return "";

        for(char c: t.toCharArray())
        {
            freq[c]++;
            req++;
        }

        int l=0, r=0;

        while(r<s.length())
        {
            char cur = s.charAt(r);
            if(freq[cur]>0) req--;
            freq[cur]--;
            r++;
            while(req==0)
            {
                if(r-l<min)
                {
                    min = r-l;
                    index = l;
                }
                freq[s.charAt(l)]++;

                if(freq[s.charAt(l)]>0) req++;
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(index, index + min);
    }
}
