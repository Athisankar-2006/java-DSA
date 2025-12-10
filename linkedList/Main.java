

// ✔ Insert at beginning
// ✔ Insert at end
// ✔ Insert at index
// ✔ Delete by value
// ✔ Delete by index
// ✔ Search
// ✔ Display


class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


//insert at the beggining of the linked list
class linkedList{
   private Node head;
void insertAtBegin(int data){
    Node newnode= new Node(data);
    newnode.next=head;
    head=newnode;

}

//insert data at end
void insertAtEnd(int data){
    Node temp= head;
   Node newnode=new Node(data);
    if(head==null){
       newnode=head;
       return;

    }

    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;

}



//delete node
void deleteByValue(int key){
    Node temp=head;
  
    if(temp.data==key){
        head=head.next;
        return;

    }
    while(temp.next!=null && temp.next.data!=key){
        temp=temp.next;
    }
    
    if(temp.next!=null){
        temp.next=temp.next.next; 
    }
   


}


//delete at index

void deleteindex(int index){

    Node temp=head;

    if(index==0){
        head=head.next;
        return;
    }

    if(index<0||head==null)return;

    for(int i=0;temp!=null && i<index-1;i++){
        temp=temp.next;
    }
    if(temp.next==null||temp==null)return;
    temp.next=temp.next.next;

}

public boolean search(int key){
    Node temp=head;
    
    while(temp!=null){
        if(temp.data==key){
            System.out.print("key found");
            temp=temp.next;
        }
    }
    return false;
}



//display the node

void display(){
    Node temp=head;

    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");

}


}




public class Main {
    public static void main(String[] args) {

        linkedList li= new linkedList();
        li.insertAtBegin(5);
        li.insertAtBegin(6);
        li.insertAtBegin(7);
        li.insertAtBegin(8);
        li.insertAtEnd(10);



        // li.deleteByValue(8);
        // li.deleteindex(2);


        
        li.search(6);

        li.display();
        
    }
    
}
