/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode currNode = head;
        
        while(currNode != null && currNode.next != null) {
            
                
            if(currNode.val == currNode.next.val) {
                
                //Removes currNode's pointer to the next node and replaces it with a pointer to the node after the next node
                currNode.next = currNode.next.next;
                
            }
            else{
                currNode = currNode.next;
            }    
            
        }
        
        //Returning the head returns the now modified list. The currNode we use in the while loop modifies the same linked list the head belongs to
        return head;
        
    }
}
