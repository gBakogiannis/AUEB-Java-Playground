package files.cf.week6arrays3;

import java.util.Arrays;

public class QueueDemo {

    static int[] queue = new int[10];
    static int top = -1;

    public static void main(String[] args) {
        int num;

        enQueue(1);
        enQueue(2);
        enQueue(3);
        printQueue();

        num = deQueue();
        printQueue();
    }

    /**
     * Inserts a num at the end of the queue.
     *
     * @param val   the num to be inserted.
     */
    public static void enQueue(int val) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[++top] = val;
    }

    /**
     * Returns (and essentially deletes) the first
     * queue element.
     *
     * @return      the element to the front of the queue
     */
    public static int deQueue() {
        int num = 0;

        if (isEmpty()) throw new RuntimeException("Queue is empty");
        num = queue[0];

        // Arrays.copyOfRange returns an array with (to - from)
        // elements. If 'to' which is not inclusive is greater
        // than length, then the returned array is right padded
        // with zeros.
        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    /**
     * Returns true if the queue is full.
     *
     * @return      true if the queue is full,
     *              false otherwise
     */
    public static boolean isFull() {
        return (top == queue.length - 1);
    }

    /**
     * Returns true if the queue is empty.
     *
     * @return      true if the queue is empty,
     *              false otherwise
     */
    public static boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Prints the elements of the queue.
     */
    public static void printQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Queue");
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
