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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null) return head;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode dummy=new ListNode(-1);
        ListNode tmp=dummy;
        while(head!=null){
            if(!set.contains(head.val)){
                tmp.next=new ListNode(head.val);
                tmp=tmp.next;
            }
            head=head.next;
        }
        return dummy.next;
        
    }
}