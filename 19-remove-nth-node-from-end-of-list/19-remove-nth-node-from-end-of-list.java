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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode dummy_head = head;
        ListNode new_head = head;
        
        
        while(dummy_head.next!=null){
            dummy_head = dummy_head.next;
            count++;
        }
        
        if(count == n){
            head = head.next;
            return head;
        }
        
        for(int i = 1; i < (count - n); i++){
            new_head = new_head.next;            
        }
        new_head.next = new_head.next.next;
        return head;
        
    }
}