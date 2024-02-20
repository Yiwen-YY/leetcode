package pers.yiwen.stackandqueue._0232;

import java.util.Stack;

// Implement Queue using Stacks
class MyQueue {
    Stack<Integer> stackIn, stackOut;
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {

    }

    public int peek() {

    }

    public boolean empty() {
        stackIn.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
