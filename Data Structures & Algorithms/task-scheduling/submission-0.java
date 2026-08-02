class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for(char c: tasks){
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.addAll(freqMap.values());


        int time =0;
        while(!pq.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<n+1; i++){
                if(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }

            for(int freq: list){
                if(--freq>0){
                    pq.add(freq);
                }
            }

            time += pq.isEmpty() ? list.size() : n+1;
        }
        return time;
    }
}
