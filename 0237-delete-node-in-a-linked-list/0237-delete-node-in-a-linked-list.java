class Solution {
    public void deleteNode(ListNode node) {
        ArrayList<Integer> al=new ArrayList<>();

        ListNode temp=node;

        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }

        al.remove(0);

        temp=node;
        ListNode prev=null;
        int i=0;

        while(i<al.size()){
            temp.val=al.get(i);
            prev=temp;
            temp=temp.next;
            i++;
        }

        prev.next=null;
    }
}