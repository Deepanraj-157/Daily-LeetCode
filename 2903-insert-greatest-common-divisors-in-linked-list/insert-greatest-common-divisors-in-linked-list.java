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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null && head.next==null) return head;
        ListNode tmp=head;
        while(tmp!=null && tmp.next!=null){
            ListNode newnode=new ListNode(gcd(tmp.val, tmp.next.val));
            newnode.next=tmp.next;
            tmp.next=newnode;
            tmp=tmp.next.next;
        }
        return head;
        
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}