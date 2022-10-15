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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
            return null;
        int j=1;
        while(j<lists.length){
        for(int i=0;i+j<lists.length;i=i+j*2){
            lists[i]= mergeTwoLists(lists[i],lists[i+j]);
        }
            j=j*2;
    }
        return lists[0];
    }
        
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        if(list1==null) return list2;
        if(list2==null) return list1;
        
        ListNode dummyHead=new ListNode(list1.val);
        ListNode temp=dummyHead;
        while(list1!=null && list2!=null){ 
        if(list1.val<=list2.val){
            temp.next=new ListNode(list1.val);
            list1=list1.next;
        }
            else{
                temp.next=new ListNode(list2.val);
                list2=list2.next;
            }
            temp=temp.next;
    }
        if(list1!=null)
            temp.next=list1;
        else
            temp.next=list2;
        return dummyHead.next;
    }
}
