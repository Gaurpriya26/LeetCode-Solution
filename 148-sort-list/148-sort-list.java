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
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null) 
           return head;
        ListNode mid= getMid(head);
        ListNode left= sortList(head);
        ListNode right= sortList(mid);
        return merge(left,right);
    }
    
    ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyHead=new ListNode();
        ListNode temp=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
                 temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
            temp.next=(list1!=null)? list1: list2;
            return dummyHead.next;          
    }
    ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast= head;
        while (fast.next != null && fast.next.next != null) {
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
}
 