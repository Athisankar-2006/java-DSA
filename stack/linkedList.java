
class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data=data;
    }

}


public class linkedList {


    ListNode top=null;
    void push(int data){
        ListNode newNode=new ListNode(data);
        if(top==null){
            top=newNode;
            return;

        }
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(top==null){
           System.out.println("under flow:"); 
           return -1;
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }

    int  peek(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }

    int isEmpty(){
        if(top==null){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        linkedList stackll=new linkedList();
        stackll.push(5);
        stackll.push(4);
        stackll.push(3);
        stackll.push(2);
        stackll.push(1);
      System.out.println("Popped: " + stackll.pop()); // prints 1
        System.out.println("Top element (peek): " + stackll.peek()); // prints 2
        System.out.println("Is stack empty? " + stackll.isEmpty()); // false
    }
    
}
