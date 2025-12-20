
// sort the linked list using the merge sort


class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class linkedList {
    Node head;
    public void insert(int val){
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    


    public void print(Node head){
        Node temp=head;

        while(temp.next!=null && temp!=null){
            System.out.println(temp+"-->");
            temp=temp.next;
        }
        System.out.println();

}


public Node mergeall(Node head){

    if(head==null || head.next==null){
        return head;
    }


    Node mid=getmid(head);
    Node nextofmid=mid.next;
    mid.next=null;

    Node left=mergeall(head);
    Node right=mergeall(nextofmid);

    return merged(left, right);


}



public Node getmid(Node head){

    if(head==null) return head;

    Node slow=head;
    Node fast=head.next;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    return slow;

}

public Node merged(Node l1,Node l2){
    if(l1==null) return l2;
    if(l2==null) return l1;

       if (l1.val <= l2.val) {
            l1.next = merged(l1.next, l2);
            return l1;
        } else {
            l2.next = merged(l1, l2.next);
            return l2;
        }

}


}

public class sort {
    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.insert(4);
        list.insert(2);
        list.insert(1);
        list.insert(3);
        list.insert(5);

        System.out.println("Original List:");
        list.print(list.head);

        list.head = list.mergeall(list.head);

        System.out.println("Sorted List:");
        list.print(list.head);
        
    }
    
}
