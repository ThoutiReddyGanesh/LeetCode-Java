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
    public boolean isPalindrome(ListNode head) {
        int c=0;
        ListNode temp=head;

        while(temp!=null){
            c++;
            temp=temp.next;
        }

        int[] a=new int[c];
        temp=head;

        for(int i=0;i<c;i++){
            a[i]=temp.val;
            temp=temp.next;
        }

        int i=0;
        int j=c-1;

        while(i<j){
            if(a[i]!=a[j])
                return false;

            i++;
            j--;
        }

        return true;
    }
}