class PrefixTree {
    class TrieNode{
        TrieNode[] arr;
        boolean flag;
        public TrieNode(){
            arr = new TrieNode[26];
            flag = false;
        }
    }
    TrieNode root;
    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.arr[c-'a']==null){
                node.arr[c-'a']=new TrieNode();
            }
            node = node.arr[c-'a'];
        }
        node.flag = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.arr[c-'a']==null){
                return false;
            }
            node = node.arr[c-'a'];
        }
        return node.flag;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            if(node.arr[c-'a']==null){
                return false;
            }
            node = node.arr[c-'a'];
        }
        return true;
    }
}
