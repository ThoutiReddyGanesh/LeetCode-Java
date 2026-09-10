class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node;

        while (temp.next!=null) {
            temp.val=temp.next.val;

            if (temp.next.next == null) {
                temp.next = null;
                break;
            }

            temp =temp.next;
        }
    }
}