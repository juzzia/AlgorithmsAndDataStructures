package com.git;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        }
    }
}
