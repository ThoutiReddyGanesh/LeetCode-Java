class MyLinkedList { 
    class Node{ 
        int val; 
        Node next; 
        Node(int val){ 
            this.val=val; 
            next=null; 
        } 
    } 
Node head; 
 
    public MyLinkedList() { 
         
    } 
     
    public int get(int index) { 
    Node temp=head; 
 
    for(int i=0;i<index && temp!=null;i++){ 
        temp=temp.next; 
    } 
 
    if(temp==null){ 
        return -1; 
    } 
 
    return temp.val; 
 
         
    } 
     
    public void addAtHead(int val) { 
        Node n=new Node(val); 
        if(head==null){ 
            head=n;} 
            else{ 
                n.next=head; 
                head=n; 
            } 
        } 
         
     
     
    public void addAtTail(int val) { 
        Node n=new Node(val); 
        if(head==null){ 
            head=n;} 
            else{ Node temp=head; 
            while(temp.next!=null){ 
                temp=temp.next;} 
                temp.next=n; 
            } 
    } 
 
 
    public void addAtIndex(int index, int val) { 
          Node n=new Node(val); 
        if(index==0){ 
            n.next=head; 
            head=n;} 
        else{ 
            Node temp=head; 
            for(int i=0;i<index-1 && temp!=null;i++){ 
                temp=temp.next;} 
                if(temp==null) return; 
                n.next=temp.next; 
                temp.next=n; 
            } 
        } 
         
    public void deleteAtIndex(int index) { 
        if(head==null) return; 
        else if(index==0){ 
            head=head.next; 
            return;} 
        else{ Node temp=head; 
        for(int i=0;i<index-1 && temp.next!=null;i++){ 
            temp=temp.next;} 
            if(temp.next==null) return; 
            else temp.next=temp.next.next; 
        }} 
         
    } 