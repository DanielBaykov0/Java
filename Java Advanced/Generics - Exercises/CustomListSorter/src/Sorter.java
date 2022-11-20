public class Sorter {

    public Sorter() {
    }

    static <T extends Comparable<T>> void sort(MyList<T> list) {
        list.sort();
    }
}
