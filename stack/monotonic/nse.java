package monotonic;

import java.util.Arrays;
import java.util.Stack;

//next smallest elemeent

public class nse {

    public static int[] monotonic(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();

      for(int i=n-1;i>=0;i--){

        while(!stack.isEmpty() && stack.peek()>=arr[i]){
            stack.pop();
        }
        res[i]=stack.isEmpty()? -1:stack.peek();
        stack.push(arr[i]);
      }
      return res;

    }

        public static void main(String[] args) {

       int[] arr= {4,2,1,4,3};
       int[] ans=monotonic(arr);

        System.out.println(" "+Arrays.toString(arr));
        System.out.println(" "+Arrays.toString(ans));
        
    }
}
