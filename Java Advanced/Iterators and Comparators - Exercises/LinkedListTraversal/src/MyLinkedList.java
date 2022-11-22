import java.util.Arrays;
import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>, LinkedListInterface<T> {

    T[] items;
    int capacity = 10;
    int count;

    public MyLinkedList() {
        this.items = (T[]) new Object[capacity];
        this.count = 0;
    }

    public MyLinkedList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: "
                    + initialCapacity);
        }
        this.items = (T[]) new Object[initialCapacity];
        this.count = 0;
    }

    public void grow() {
        this.items = Arrays.copyOf(this.items, (this.count * 2));
    }

    @Override
    public void add(T t) {
        if (this.count >= this.items.length) {
            this.grow();
        }
        this.items[count++] = t;
    }

    private void removeFirstOccurrenceElement(int firstOccurrenceIndex) {
        T[] collection = (T[]) new Object[this.items.length];
        for (int i = 0, indexOfCollection = 0; i < this.count; i++, indexOfCollection++) {
            if (indexOfCollection == firstOccurrenceIndex) {
                indexOfCollection++;
            }
            collection[i] = this.items[indexOfCollection];
        }
        this.items = Arrays.copyOf(collection, (this.count * 2));
    }

    @Override
    public boolean remove(T t) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == t) {
                this.count--;
                removeFirstOccurrenceElement(i);
                return true;
            }
        }

        return false;
    }

    @Override
    public int getSize() {
        return this.count;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private final class LinkedListIterator implements Iterator<T> {

        int currentIndex;

        public LinkedListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return this.currentIndex < count;
        }

        @Override
        public T next() {
            return items[this.currentIndex++];
        }
    }
}
