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
        if(head==null ||head.next==null||head.next.next==null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int i=1; //current position
        int prevCriticalposition =-1;
        int firstCriticalposition =-1;
        int minDistance =Integer.MAX_VALUE;
        int maxDistance =-1;
        while(curr.next!=null){
            if(curr.val>prev.val && curr.val>curr.next.val ||curr.val<prev.val &&curr.val<curr.next.val ){
                if(firstCriticalposition ==-1){
                    // prevCriticalposition=i;
                    firstCriticalposition =i;
                }else{
                    minDistance=Math.min(minDistance,i-prevCriticalposition);
                    //  prevCriticalposition=1;
                     maxDistance =i-firstCriticalposition;
                }
                prevCriticalposition=i;
            }
            i++;
            prev=curr;
            curr=curr.next;

        }
       if (maxDistance == -1) return new int[]{-1, -1};
        return new int[]{minDistance, maxDistance};
    }
}