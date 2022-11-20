import java.util.ArrayList;
import java.util.List;

public class ListUtilities<T> {

    List<T> list;

    public ListUtilities() {
        this.list = new ArrayList<>();
    }

    static <T extends Comparable> T getMin(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Wrong input");
        }

        T min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(0);
            }
        }

        return min;
    }

    static <T extends Comparable> T getMax(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Wrong input");
        }

        T max = list.get(list.size() - 1);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }
}
