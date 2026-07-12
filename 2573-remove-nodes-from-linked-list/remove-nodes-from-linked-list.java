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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode rev=reverse(head);
        int max=Integer.MIN_VALUE;
        display(rev);
        ListNode tmp=rev;

        ListNode dummy=new ListNode(-1);
        ListNode tmp2=dummy;
        while(tmp!=null){
            if(tmp.val>=max) {
                tmp2.next=new ListNode(tmp.val);
                tmp2=tmp2.next;
            }
            max=Math.max(max,tmp.val);
            tmp=tmp.next;
        }
        dummy=reverse(dummy.next);
        return dummy;
        
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    public void display(ListNode head){
        while(head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}