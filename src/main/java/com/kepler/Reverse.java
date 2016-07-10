package com.kepler;

import java.util.Stack;

/**
 * Created by pauldowney on 7/10/16.
 */
public class Reverse {

    public static String reverse(String str) {

        if(str.isEmpty()) {
            return "";
        }

        return reverse(str.substring(1,str.length()))+str.charAt(0);

    }

    public static String reverseStack(String str) {

        Stack<Character> stack  = new Stack<Character>();

        for(int index=0;index<str.length();index++) {
            stack.push(str.charAt(index));
        }

        String reversedString = "";

        while(!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        return reversedString;

    }

    public static void main(String[] args) {
        System.out.println(reverseStack("12345"));
    }

}

