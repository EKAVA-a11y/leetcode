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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        int size = n / k;
        int extra = n % k;
        temp = head;
        for (int i = 0; i < k; i++) {
            ans[i] = temp;
            int currentSize = size;
            if (extra > 0) {
                currentSize++;
                extra--;
            }
            for (int j = 1; j < currentSize; j++) {
                temp = temp.next;
            }
            if (temp != null) {
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;
            }
        }
        return ans;
    }
}