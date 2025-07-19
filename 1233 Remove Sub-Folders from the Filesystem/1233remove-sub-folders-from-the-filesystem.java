import java.util.*;

class TrieNode {
    Map<String, TrieNode> children = new HashMap<>();
    boolean end = false;
}

class Solution {
    public List<String> removeSubfolders(String[] folders) {
        Arrays.sort(folders);
        TrieNode root = new TrieNode();
        List<String> result = new ArrayList<>();

        for (String folder : folders) {
            TrieNode node = root;
            String[] parts = folder.split("/");
            boolean valid = true;
            
            for (int i = 1; i < parts.length; i++) {
                if (node.children.containsKey(parts[i]) && node.children.get(parts[i]).end) {
                    valid = false;
                    break;
                }
                node.children.putIfAbsent(parts[i], new TrieNode());
                node = node.children.get(parts[i]);
            }
            
            if (valid) {
                node.end = true;
                result.add(folder);
            }
        }
        return result;
    }
    
    // Main method
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] folders = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> result = sol.removeSubfolders(folders);
        System.out.println("Result: " + result);
    }
}