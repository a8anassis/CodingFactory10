package gr.aueb.cf.ch6;

/**
 * Υλοποιεί μία λογική Last-In-First-Out (LIFO).
 */
public class StackApp {
    static int[] stack = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        push(1);        // top -> 0
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);        // top -> 5

        printStack();
        num = pop();
        System.out.println("Popped: " + num);
        System.out.println();
        printStack();
    }

    public static void push(int num) {
        if (isFull()) {
            System.err.println();
            return;
        }
        top++;
        stack[top] = num;
        //stack[++top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        int num = stack[top];
        top--;
        return num;
        //return stack[top--];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == stack.length - 1;
    }

    public static void printStack() {
       if (isEmpty()) {
           throw new RuntimeException("Stack is empty!");
       }

       for (int i = top; i >= 0; i--) {
           System.out.println(stack[i]);
       }
    }
}
