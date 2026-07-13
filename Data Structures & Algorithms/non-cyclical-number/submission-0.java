class Solution {
    public boolean isHappy(int n) {
        return help(n, new HashSet<>());
    }

    public boolean help(int n, Set<Integer> list){
        int sum = 0;
        list.add(n);
        while (n > 0) {
            int digit = n % 10;
            sum+=digit*digit;
            n = n / 10;
        }

        if(sum==1) return true;
        if(list.contains(sum)) return false;
        return help(sum, list);
        
    }
}
