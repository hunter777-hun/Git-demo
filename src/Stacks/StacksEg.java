package Stacks;

import java.util.Stack;

public class StacksEg {

    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();


        //add the elements in the stack
        stack.push("Dipesh");
        stack.push("Nitesh");
        stack.push("Ramesh");
        stack.push("Crystal");

        //stack.pop();

        //stack.peak(); returns the top of the elements

        //stack.search("Dipesh");
        //gives the index of Dipesh and returns -1 if it doesn't find the element


        for(String s: stack) {
            System.out.println(s);
        }





    }
}
