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
import java.util.*;
import java.math.BigInteger;
class Solution{
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode temp=l1;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;}

        BigInteger sum=BigInteger.ZERO;
        for(int i=al.size()-1;i>=0;i--){
            sum=sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(al.get(i)));}

        ListNode temp2=l2;
        ArrayList<Integer> al2=new ArrayList<>();
        while(temp2!=null){
            al2.add(temp2.val);
            temp2=temp2.next;}

        BigInteger sum2=BigInteger.ZERO;
        for(int j=al2.size()-1;j>=0;j--){
            sum2=sum2.multiply(BigInteger.TEN).add(BigInteger.valueOf(al2.get(j)));}

        BigInteger add=sum.add(sum2);
        ListNode nh=null;
        ListNode t=null;
        ArrayList<Integer> re=new ArrayList<>();
        String s=add.toString();
        for(int k=s.length()-1;k>=0;k--){
            re.add(s.charAt(k)-'0');}

        for(int x:re){
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