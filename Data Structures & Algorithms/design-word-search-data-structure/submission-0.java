class WordDictionary {
    class TrieNode{
        TrieNode[] tree;
        boolean flag;
        public TrieNode(){
            tree = new TrieNode[26];
            flag = false;
        }
    }
    TrieNode root;
    public WordDictionary() {
        root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.tree[c-'a']==null){
                node.tree[c-'a']=new TrieNode();
            }
            node = node.tree[c-'a'];
        }
        node.flag = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode node){
        if(node==null) return false;
        if(index == word.length()) return node.flag;

        char c = word.charAt(index);

        if(c=='.'){
            for(int i=0; i<26; i++){
                if(dfs(word, index+1, node.tree[i])) return true;
            }

            return false;
        }

        return dfs(word, index+1, node.tree[c-'a']);
    }
}
