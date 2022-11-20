public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public int compareTo(Box<T> box) {
        return this.element.compareTo(box.element);
    }

}
