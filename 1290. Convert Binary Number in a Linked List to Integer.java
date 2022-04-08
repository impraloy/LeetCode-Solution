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
        int currentNum = 0;
        ListNode iter = head;
        while(iter != null){
            currentNum = 2*currentNum + iter.val;
            iter = iter.next;
        }
        return currentNum;
        
    }
}