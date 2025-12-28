package monotonic;

import java.util.Arrays;
import java.util.Stack;

public class pge {

    public static int[] monotonic(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();

       for(int i=0;i<n;i++){

        while(!stack.isEmpty() && stack.peek()<=arr[i]){
            stack.pop();
        }
        res[i]=stack.isEmpty()? -1:stack.peek();
        stack.push(arr[i]);
       }
       return res;

    }



    public static void main(String[] args) {
        int[] arr={4,2,8,12,5};
        int[] result=monotonic(arr);

        System.out.println("before "+Arrays.toString(arr));
        System.out.println("after "+Arrays.toString(result));
    }
    
}
