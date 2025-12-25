import java.util.Arrays;
import java.util.Stack;

public class reverseArr {

        static void reverse(int[] arr){
         Stack <Integer> stack=new Stack<>();

         for(int num:arr){
            stack.push(num);
         }

        for(int i=0;i<arr.length;i++){
            arr[i]=stack.pop();
        }

        }

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
    
}
