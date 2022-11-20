public class BoxOfIntegers<T> {

    T value;

    public BoxOfIntegers(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.getClass().toString() +
                ": " + this.value;
    }
}
