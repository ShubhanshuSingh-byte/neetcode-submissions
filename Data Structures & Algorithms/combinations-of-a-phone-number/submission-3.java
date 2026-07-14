class Solution {
    HashMap<Integer, String> map;
    public List<String> letterCombinations(String digits) {
        map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> list = new ArrayList<>();
        if(digits==null || digits.length()==0) return list;

        bt(0, list, new StringBuilder(), digits);
        return list;
    }

    public void bt(int index, List<String> list, StringBuilder sb, String digits) {
        if(sb.length()==digits.length()){
            list.add(sb.toString());
            return;
        }


        for(char c: map.get(digits.charAt(index)-'0').toCharArray()){
            sb.append(c);
            bt(index+1, list, sb, digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
