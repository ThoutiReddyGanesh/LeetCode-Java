public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c=0,d=0;
        ListNode temp=headA;
        ListNode temp2=headB;

        while(temp!=null){
            c++;
            temp=temp.next;
        }

        while(temp2!=null){
            d++;
            temp2=temp2.next;
        }

        temp=headA;
        temp2=headB;

        if(c>d){
            for(int i=0;i<c-d;i++)
                temp=temp.next;
        }
        else{
            for(int i=0;i<d-c;i++)
                temp2=temp2.next;
        }

        while(temp!=temp2){
            temp=temp.next;
            temp2=temp2.next;
        }

        return temp;
    }
}