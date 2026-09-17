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
    public ListNode swapNodes(ListNode head, int k) {
     ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }


            Collections.swap(list,k-1,list.size()-k);
        
        ListNode nh=null;
        ListNode t=null;
        for(int x:list){
            ListNode n=new ListNode(x);
            if(nh==null){
                nh=n;
                t=n;}
                else{
                    t.next=n;
                    t=n;}
                
            }
            
            return nh;
        }
    
}    
    
