import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator<T> implements Iterable<T> {

    List<T> items;
    int index;

    public ListIterator(T... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        this.index = 0;
    }

    public boolean move() {
        if (hasNext()) {
            this.index++;
            return true;
        }

        return false;
    }

    public boolean hasNext() {
        return this.index < this.items.size() - 1;
    }

    public void print() throws Exception {
        if (this.items.isEmpty()) {
            throw new Exception("Invalid Operation!");
        } else {
            System.out.println(this.items.get(this.index));
        }
    }

    public void printAll() {
        this.items.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }
}
