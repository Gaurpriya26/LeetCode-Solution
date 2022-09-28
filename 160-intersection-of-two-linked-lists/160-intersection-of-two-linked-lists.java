/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=findLength(headA);
        int lenB=findLength(headB);
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
         while(lenA<lenB){
            headB=headB.next;
            lenB--;
        }
        while(headA!=headB){
             headA=headA.next;
             headB=headB.next;
        }
        return headB;
    }
    public int findLength(ListNode node){
        int length=0;
        while(node!=null){
            node=node.next;
            length++;
        }
        return length;
    }
}