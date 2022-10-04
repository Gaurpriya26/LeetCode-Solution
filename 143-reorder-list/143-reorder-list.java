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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode premid=slow;
        ListNode cur=premid.next;
        
        while(cur.next!=null){
            ListNode next=cur.next;
            cur.next=next.next;
            next.next= premid.next;
            premid.next=next;
        }
        
        ListNode p1=head;
        ListNode p2=premid.next;
        
        while(p1!=premid){
            premid.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=premid.next;
        }
    }
}