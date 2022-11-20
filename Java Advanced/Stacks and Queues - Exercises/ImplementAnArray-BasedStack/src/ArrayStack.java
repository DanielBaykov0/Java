public class ArrayStack {

    private int[] elements;
    private static final int DEFAULT_SIZE = 10;
    int count = 0;

    public ArrayStack(int capacity) {
        this.elements = new int[capacity];
    }

    public ArrayStack() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return count == elements.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        elements[++count] = item;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        return elements[count--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }

        return elements[count];
    }

}
