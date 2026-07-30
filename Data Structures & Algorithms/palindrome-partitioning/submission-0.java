class Solution {
    public List<List<String>> partition(String s) {
        List<String> res = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        bt(0, res, ans, s);
        return ans;
    }

    public void bt(int index, List<String> res, List<List<String>> ans, String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i=index; i<s.length(); ++i){
            if(isPalindrome(s, index, i)){
                res.add(s.substring(index, i+1));
                bt(i+1, res , ans, s);
                res.removeLast();
            }
        }
    }

    public boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;

            l++;
            r--;
        }
        return true;
    }
}
