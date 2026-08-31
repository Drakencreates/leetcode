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
        if(head==null || head.next==null || head.next.next == null){
            return new int[]{-1,-1};
            }
    List<Integer>l = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = curr.next;
        int index = 1;
    


        while(nxt!=null){
            if(curr.val>prev.val && curr.val>nxt.val || curr.val<prev.val && curr.val<nxt.val){
              l.add(index);
                
                

            }
         prev = curr;
         curr = nxt;
         nxt = nxt.next;
         index++;


        }
        if(l.size()<2){
            return new int[]{-1,-1};
        }
        int minDist = Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            minDist = Math.min(minDist,l.get(i)-l.get(i-1));
        }
        int maxDist =  l.get(l.size()-1) - l.get(0);

        return new int[]{minDist,maxDist};


    }
}