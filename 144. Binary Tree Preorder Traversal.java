/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> nodeList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if(root == null){
            return nodeList;
        }

        TreeNode currNode = root;

        // The current node has to be null and
        // the stack must be empty in order for the
        // traversal to be finished
        while(currNode != null || !stack.isEmpty()){

            // Checks the left side all the way down the tree
            while(currNode != null){
                // Push node to the stack
                stack.push(currNode);
                // Add node to list
                nodeList.add(currNode.val);
                // Go to next left-most node
                currNode = currNode.left;
            }

            // Check the right side of the most current
            // left-most node
            currNode = stack.pop().right;


        }



        return nodeList;

    }
}
