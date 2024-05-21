package files.cf.week6arrays3;

public class StackDemo {

    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        printStack();
        num = pop();
        System.out.printf("Num %d was popped%n", num);
        System.out.println("Contents of the stack:");
        printStack();
    }

    /**
     * Inserts a num on top of stack.
     *
     * @param num       the input num
     */
    public static void push(int num) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = num;         // same as: top++; stack[top] = num;
    }

    /**
     * Gets (and essentially removes) a num from
     * the top of the stack.
     *
     * @return      the num from the top of the stack
     */
    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[--top];
    }

    /**
     * Returns true if the stack is full.
     *
     * @return      true if the stack is full,
     *              false otherwise
     */
    public static boolean isFull() {
        return (top == stack.length - 1);
    }

    /**
     * Returns true if the stack is empty.
     *
     * @return      true if the stack is empty,
     *              false otherwise.
     */
    public static boolean isEmpty() {
        return (top == -1);
    }

    public static void printStack() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println();
    }
}
