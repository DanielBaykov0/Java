public class Threeuple<T, E, R> {

    T element1;
    E element2;
    R element3;

    public Threeuple(T element1, E element2, R element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public T getElement1() {
        return element1;
    }

    public E getElement2() {
        return element2;
    }

    public R getElement3() {
        return element3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.getElement1(), this.getElement2(), this.getElement3());
    }
}
