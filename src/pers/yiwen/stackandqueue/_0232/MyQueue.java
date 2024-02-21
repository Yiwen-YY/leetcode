package pers.yiwen.stackandqueue._0232;

import java.util.Stack;

// Implement Queue using Stacks
class MyQueue {
    Stack<Integer> stack, stackTemp;
    public MyQueue() {
        stack = new Stack<>();
        stackTemp = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        while (!stack.empty()) {
            stackTemp.push(stack.pop());
        }

        int num = stackTemp.pop();

        while (!stackTemp.empty()) {
            stack.push(stackTemp.pop());
        }

        return num;
    }

    public int peek() {
        while (!stack.empty()) {
            stackTemp.push(stack.pop());
        }

        int num = stackTemp.peek();

        while (!stackTemp.empty()) {
            stack.push(stackTemp.pop());
        }

        return num;
    }

    public boolean empty() {
        return stack.empty();
    }
}