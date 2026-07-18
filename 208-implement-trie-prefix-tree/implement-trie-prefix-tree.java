class TrieNode{
    HashMap<Character,TrieNode> h;
    boolean isEnd;
    TrieNode(){
        h=new HashMap<>();
        isEnd=false;
    }
}
class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            curr.h.putIfAbsent(c,new TrieNode());
            curr=curr.h.get(c);
        }
        curr.isEnd=true;
        
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray()){
            if(!curr.h.containsKey(c)) return false;
            curr=curr.h.get(c);
        }
        if(curr.isEnd==false) return false;
        return true;
    }

    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char c:prefix.toCharArray()){
            if(!curr.h.containsKey(c)) return false;
            curr=curr.h.get(c);
        }
        return true;    }   
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */