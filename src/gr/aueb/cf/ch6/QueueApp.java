package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Queues are FIFO (First In First Out) logic.
 * Implemented with:
 * enqueue()
 * dequeue()
 */
public class QueueApp {
    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);

        printQueue();
        num = dequeue();
        System.out.println("Dequeued: " + num);
        System.out.println();
        printQueue();
    }

    public static void enqueue(int val) {
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }
        queue[++top] = val;
    }

    public static int dequeue() {
        int num;

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        num = queue[0];

        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == queue.length - 1;
    }

    public static void printQueue() {
       if (isEmpty()) {
           throw new RuntimeException("Queue is empty!");
       }
       for (int i = 0; i <= top; i++) {
           System.out.println(queue[i]);
       }
    }
}
