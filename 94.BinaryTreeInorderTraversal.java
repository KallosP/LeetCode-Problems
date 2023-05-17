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

    public List<Integer> inorderTraversal(TreeNode root) {
        
        TreeNode currNode;
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();

        if(root == null) {
            return list;
        }

        currNode = root;

        // The current node has to be null and
        // the stack must be empty in order for the
        // traversal to be finished
        while(currNode != null || !nodeStack.isEmpty()) {
            
            // Checks the left side all the way down the tree
            while(currNode != null) {
                // Save the current node by stacking it
                nodeStack.push(currNode);
                // Check if there's a left node, if yes, loop and save it again
                currNode = currNode.left;
            }

            // Note: Can think of pushing nodes to the stack
            //       as saving nodes for future use

            // After left side traversal is done,
            // get access to the most recently saved
            // node by popping from the stack.
            // This is what stores the nodes in the
            // correct order in the list.
            currNode = nodeStack.pop();
            list.add(currNode.val);

            // Checks the right side of the current node.
            // Although it's the right node, it
            // has the "left node logic" applied to it.
            // Because of this I just call this type of traversal
            // a left heavy traversal.
            currNode = currNode.right;

        }
        
        
        return list;

    }
}
