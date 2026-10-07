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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> obj=new HashSet<>();
        for(int i:nums){
            obj.add(i);
        }
        int sum=0;
        int count=0;
        while(head!=null){
            if(obj.contains(head.val)) count=1;
            else{
                sum=sum+count;
                count=0;
            }
            head=head.next;
        }
        sum=sum+count;
        return sum;
    }
}