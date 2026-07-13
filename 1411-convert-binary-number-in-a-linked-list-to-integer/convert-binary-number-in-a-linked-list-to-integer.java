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
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        ListNode rev=reverse(head);
        int sum=0;
        int power=0;
        while(rev!=null){
            sum+=rev.val*Math.pow(2,power);
            power++;
            rev=rev.next;
        }
        return sum;
        
    }
    private ListNode reverse(ListNode head){
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
}