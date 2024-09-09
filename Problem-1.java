// Time Complexity : O(l)
// Space Complexity : O(l)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope

class TrieNode{
    boolean isEnd;
    TrieNode [] childrens;
    TrieNode(){
        childrens = new TrieNode[26];
    }
}

class Trie {
TrieNode root;    
public Trie() {
    root = new TrieNode();
}

public void insert(String word) { // O(l)
    TrieNode cur = root;
    char [] chars = word.toCharArray();
    for(char c: chars){
        if(cur.childrens[c - 'a'] == null){
            cur.childrens[c - 'a'] = new TrieNode();
        }
        cur = cur.childrens[c - 'a'];
    }
    cur.isEnd = true;
}

public boolean search(String word) { //O(l)
    TrieNode cur = root;
    char [] chars = word.toCharArray();
    for(char c: chars){
        if(cur.childrens[c - 'a'] == null){
            return false;
        }
        cur = cur.childrens[c - 'a'];
    }
    return cur.isEnd;
}

public boolean startsWith(String prefix) { //O(l)
    TrieNode cur = root;
    char [] chars = prefix.toCharArray();
    for(char c: chars){
        if(cur.childrens[c - 'a'] == null){
            return false;
        }
        cur = cur.childrens[c - 'a'];
    }
    return true;
}
}

/**
* Your Trie object will be instantiated and called as such:
* Trie obj = new Trie();
* obj.insert(word);
* boolean param_2 = obj.search(word);
* boolean param_3 = obj.startsWith(prefix);
*/