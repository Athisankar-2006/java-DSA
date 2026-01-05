package queue;

public class queueusingarr {
    static int size=3;
    int arr[];
    int first=-1;
    int rear=-1;
    queueusingarr(){
        arr=new int[size];
    }

  void enqueue(int data){
    if(rear==size-1){
        throw new IndexOutOfBoundsException("queue is full");
    }
    if(first==-1 || rear==-1){
        arr[++rear]=data;
        first++;
        return;
    }
    arr[++rear]=data;
  }


    int dequeue(){
        if(first==-1 || rear==-1 ||first>rear){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        
       return arr[first++];

    }



    public static void main(String[] args) {
        queueusingarr q= new queueusingarr();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        
    }
    
}
