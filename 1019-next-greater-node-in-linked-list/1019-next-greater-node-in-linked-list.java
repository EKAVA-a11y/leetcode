class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            int greater = 0;
            while (temp != null) {
                if (temp.val > curr.val) {
                    greater = temp.val;
                    break;
                }
                temp = temp.next;
            }
            ans.add(greater);
            curr = curr.next;
        }
        int[] obj = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            obj[i] = ans.get(i);
        }
        return obj;
    }
}