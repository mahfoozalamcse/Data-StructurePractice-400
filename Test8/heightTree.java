package Test8;


// 1. Tree: Height of a Binary Tree
// 2. QHEAP1
// 3. Dijkstra: Shortest Reach 2
// 4. The Longest Common Subsequence

public class heightTree {

    class Node {
    int data;
    Node left;
    Node right;
}

    public static int height(Node root) {
     if (root == null) {
        return -1; // base case: empty tree has height -1
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return 1 + Math.max(leftHeight, rightHeight);

    }

    public static void main(String[] args) {
        
    }
 
}
