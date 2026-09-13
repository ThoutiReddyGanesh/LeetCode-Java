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
    public ListNode reverseList(ListNode head) {
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
        int temp1=0;
        while(i<j){
           temp1=a[i];
           a[i]=a[j];
           a[j]=temp1;

            i++;
            j--;
        }

        temp=head;

        for(i=0;i<c;i++){
            temp.val=a[i];
            temp=temp.next;
        }

        return head;

    }
}