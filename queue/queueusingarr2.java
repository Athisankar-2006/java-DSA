package queue;

public class queueusingarr2 {

    static int size=3;
    int arr[];
    int rear=-1;
    queueusingarr2(){
        arr=new int[size];
    }

  void enqueue(int data){
    if(rear==size-1){
        throw new IndexOutOfBoundsException("queue is full");
    }
    if(rear==-1){
        arr[++rear]=data;
        return;
    }
    arr[++rear]=data;
  }


    int dequeue(){
        if(rear==-1){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        int temp=arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return temp;
        
      

    }



    public static void main(String[] args) {
        queueusingarr2 q= new queueusingarr2();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        
    }
    
}
