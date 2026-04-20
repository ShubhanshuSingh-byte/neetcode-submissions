class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        List<Integer>[] arr = new ArrayList[n+1];
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        for(int i: map.keySet())
        {
            int frequency = map.get(i);
            arr[frequency].add(i);
        }

        int[] res = new int[k];
        int count = 0;

        for(int i = n; i>=0 && count<k;  i--) {
            for(int num : arr[i]) {
                res[count++] = num;
                if(count == k) break;
            }
        }

        return res;
    }
}
