import java.util.Iterator;

public class MyStack<T> implements Iterable<T> {

    private T[] items;
    private int count;
    private int capacity = 16;

    public MyStack() {
        this.items = (T[]) new Object[capacity];
        this.count = 0;
    }

    public void push(T item) {
        this.items[this.count++] = item;
    }

    public T pop() throws Exception {
        if (this.count == 0) {
            throw new Exception("No elements");
        }

        T item = this.items[--this.count];
        this.items[this.count] = null;
        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private final class StackIterator implements Iterator<T> {
        private int cursor;

        public StackIterator() {
            this.cursor = count - 1;
        }

        @Override
        public boolean hasNext() {
            return this.cursor >= 0;
        }

        @Override
        public T next() {
            return items[this.cursor--];
        }
    }
}
