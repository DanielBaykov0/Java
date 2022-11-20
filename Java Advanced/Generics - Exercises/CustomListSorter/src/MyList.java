import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable<T>> implements MyListInterface<T> {

    private List<T> list;

    public MyList() {
        this.list = new ArrayList<>();
    }

    private boolean isValid(int index) {
        return index >= 0 && index < this.list.size();
    }

    @Override
    public void add(T element) {
        this.list.add(element);
    }

    @Override
    public T remove(int index) {
        if (isValid(index)) {
            this.list.remove(index);
        }

        return null;
    }

    @Override
    public boolean contains(T element) {
        return this.list.contains(element);
    }

    @Override
    public void swap(int index1, int index2) {
        if (isValid(index1) && isValid(index2)) {
            T firstIndex = this.list.get(index1);

            this.list.set(index1, this.list.get(index2));
            this.list.set(index2, firstIndex);
        }
    }

    @Override
    public int countGreaterThan(T element) {
        int count = 0;

        for (T item : this.list) {
            if (element.compareTo(item) < 0) {
                count++;
            }
        }

        return count;
    }

    @Override
    public T getMax() {
        T max = list.get(list.size() - 1);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }

    @Override
    public T getMin() {
        T min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }

        return min;
    }

    @Override
    public Iterable<T> print() {
        return this.list;
    }

    @Override
    public void sort() {

        Collections.sort(this.list);
    }
}
