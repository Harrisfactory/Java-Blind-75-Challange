/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        Map<ListNode, Integer> dictionary = new HashMap<>();

        while (head != null) {
            if(dictionary.containsKey(head)) {
                return true;
            } else {
                dictionary.put(head, 1);
            }

            head = head.next;
        }

        return false;

    }
}
