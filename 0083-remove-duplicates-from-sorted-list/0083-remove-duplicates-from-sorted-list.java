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
    public ListNode deleteDuplicates(ListNode headRef) {
   LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        
        ListNode temp=headRef;
        while(temp!=null){
            lhs.add(temp.val);
            temp=temp.next;}
        
    ListNode nh=null;
    ListNode t=null;
    for(int x: lhs){
            ListNode n=new ListNode(x);
    if(nh==null){
        nh=n;
        t=n;}
        else{
            t.next=n;
            t=n;
        }
    }
    return nh;
        
    }
}