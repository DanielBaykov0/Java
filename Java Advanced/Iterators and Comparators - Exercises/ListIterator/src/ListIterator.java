import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator<T> {

    List<T> items;
    int index;

    public ListIterator(T... items) {
        this.setItems(items);
        this.index = 0;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(T... items) {
        if (items.length == 0) {
            this.items = new ArrayList<>();
        } else {
            this.items = new ArrayList<>(Arrays.asList(items));
        }
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
            items.forEach(System.out::println);
        }
    }
}
