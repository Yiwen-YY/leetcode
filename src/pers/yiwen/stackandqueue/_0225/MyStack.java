package pers.yiwen.stackandqueue._0225;

import java.util.LinkedList;
import java.util.Queue;

// Implement Stack using Queues
class MyStack {
    Queue<Integer> queue, queueTemp;
    public MyStack() {
        queue = new LinkedList<>();
        queueTemp = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int len = queue.size();
        for (int i = 0; i < len - 1; i++) {
            queueTemp.add(queue.poll());
        }


        int num = queue.poll();

        while (!queueTemp.isEmpty()) {
            queue.add(queueTemp.poll());
        }

        return num;
    }

    public int top() {
        int len = queue.size();
        for (int i = 0; i < len - 1; i++) {
            queueTemp.add(queue.poll());
        }

        int num = queue.peek();
        queueTemp.add(queue.poll());

        while (!queueTemp.isEmpty()) {
            queue.add(queueTemp.poll());
        }

        return num;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}