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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> mp = new HashMap<>();
        ListNode temp = head;
        while(temp != null) {
            mp.put(temp.val, mp.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode t = dummy;
        while(t.next != null) {
            if(mp.get(t.next.val) > 1) {
                t.next = t.next.next;
            }
            else {
                t = t.next;
            }
        }
        return dummy.next;
    }
}