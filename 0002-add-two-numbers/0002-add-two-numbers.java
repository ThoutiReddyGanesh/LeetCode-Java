import java.util.ArrayList;
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Extract digits from l1 into ArrayList
        ListNode temp = l1;
        ArrayList<Integer> al = new ArrayList<>();
        while (temp != null) {
            al.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Build BigInteger sum from l1 digits
        BigInteger sum = BigInteger.ZERO;
        for (int i = al.size() - 1; i >= 0; i--) {
            sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(al.get(i)));
        }
        
        // Step 3: Extract digits from l2 into ArrayList
        ListNode temp2 = l2;
        ArrayList<Integer> al2 = new ArrayList<>();
        while (temp2 != null) {
            al2.add(temp2.val);
            temp2 = temp2.next;
        }

        // Step 4: Build BigInteger sum2 from l2 digits
        BigInteger sum2 = BigInteger.ZERO;
        for (int j = al2.size() - 1; j >= 0; j--) {
            sum2 = sum2.multiply(BigInteger.TEN).add(BigInteger.valueOf(al2.get(j)));
        }
        
        // Step 5: Add both BigIntegers
        BigInteger add = sum.add(sum2);

        // Step 6: Convert sum string back into a reverse-ordered linked list
        ListNode nh = null;
        ListNode t = null;
        ArrayList<Integer> re = new ArrayList<>();
        String s = String.valueOf(add);

        for (int k = s.length() - 1; k >= 0; k--) {
            re.add(s.charAt(k) - '0');
        }

        for (int x : re) {
            ListNode n = new ListNode(x);

            if (nh == null) {
                nh = n;
                t = n;
            } else {
                t.next = n;
                t = n;
            }
        }

        return nh;
    }
}