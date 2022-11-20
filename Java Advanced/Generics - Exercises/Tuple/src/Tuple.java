public class Tuple<T, E> {

    T value1;
    E value2;

    public Tuple(T value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public E getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getValue1(), this.getValue2());
    }
}
