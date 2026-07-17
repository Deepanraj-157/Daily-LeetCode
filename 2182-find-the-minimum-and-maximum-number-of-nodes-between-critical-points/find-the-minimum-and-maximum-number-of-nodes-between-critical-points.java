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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans=new int[]{-1,-1};
        if(head==null || head.next==null || head.next.next==null) return ans;
        ArrayList<Integer> arr = new ArrayList<>();
        int pos=2;
        while(head!=null && head.next!=null && head.next.next!=null){
            if(head.next.val<head.val && head.next.val <head.next.next.val)
                arr.add(pos);
            if(head.next.val>head.val && head.next.val >head.next.next.val)
                arr.add(pos);
            head=head.next;
            pos++;
        }
        if(arr.size()==0) return new int[]{-1,-1};
        if(arr.size()==1) return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        System.out.print(arr);
        for(int i=0;i<arr.size()-1;i++){
            int diff=arr.get(i+1)-arr.get(i);
            min=Math.min(min,diff);
        }
        max=arr.get(arr.size()-1)-arr.get(0);
        return new int[]{min,max};
        
    }
}