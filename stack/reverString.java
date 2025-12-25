
// import ArrayStack;

import java.util.Stack;

public class reverString {


    public static String reverse(String s){
         Stack <Character> stack=new Stack<>();

         for(char ch:s.toCharArray()){
            stack.push(ch);
         }

         StringBuilder sb=new StringBuilder();
         while(!stack.isEmpty()){
            sb.append(stack.pop());
         }
         return sb.toString();
    }
    public static void main(String[] args) {
        String s="DSA";
        System.out.println(reverse(s));
       


    }
    
}
