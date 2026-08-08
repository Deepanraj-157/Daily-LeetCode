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
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode tmp=head;
        while(tmp!=null){
            arr.add(tmp.val);
            tmp=tmp.next;
        }
        tmp=head;
        Collections.sort(arr);
        int index=0;
        while(tmp!=null){
            tmp.val=arr.get(index++);
            tmp=tmp.next;
        }
        return head;
        
    }
}