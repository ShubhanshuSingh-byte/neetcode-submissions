class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap();

        for(String i: strs)
        {
            int[] count = new int[26];
            for(int j=0; j<i.length(); j++)
            {
                count[i.charAt(j) - 'a']++;
            }

            String key = "";

            for(int k: count)
            {
                key += "#" + k;
            }

            if(!res.containsKey(key))
            {
                res.put(key, new ArrayList<String>());
            }
            res.get(key).add(i);
        }
        return new ArrayList<>(res.values());
    }
}
