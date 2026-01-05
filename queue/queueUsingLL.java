package queue;

public class queueUsingLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    
      
    } 
    
    Node front,rear;
        queueUsingLL(){
            front=null;
            rear=null;
        }


    void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=newNode;
            rear=newNode;
            
        }
        rear.next=newNode;
        rear=rear.next;

    }

    int dequeue(){
        if(front==null){
            throw new  IndexOutOfBoundsException("queue is empty");
        }
        int temp=front.data;
        front=front.next;
        return temp;
    }
    public static void main(String[] args) {
        queueUsingLL q= new queueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        
    }
    
}
