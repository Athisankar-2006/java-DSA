public class ArrayStack{

    int size;
    int[] stack;
    int top=-1;

    ArrayStack(){
        size=100;
        stack=new int[size];
    }

    void push(int data){
        if(top==size-1){
            System.out.println("over flow error");
        }
        stack[++top]=data;
    }

    int pop(){
        if(top==-1){
            System.out.println("under flow error");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return top;
    }

    int isEmpty(){
        if(top==-1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        ArrayStack stack=new ArrayStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.isEmpty();
        stack.peek();


        
    }
}