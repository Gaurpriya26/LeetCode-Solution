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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)  return true;
        ListNode middle=findMiddle(head);
        ListNode secondHalfStart=reverse(middle.next);
        ListNode firstHalf=head;
        
        while(secondHalfStart!=null){
            if(firstHalf.val!=secondHalfStart.val)
                return false;
            firstHalf=firstHalf.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&& fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}