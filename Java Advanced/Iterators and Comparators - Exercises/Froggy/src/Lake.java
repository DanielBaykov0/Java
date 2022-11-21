import java.util.Iterator;

public class Lake implements Iterable<Integer> {

    private int[] numbers;

    public Lake(int... numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<Integer> {

        private int index;

        @Override
        public boolean hasNext() {
            if (this.index % 2 == 0) {
                return true;
            }

            return this.index < numbers.length;
        }

        @Override
        public Integer next() {
            int element = numbers[this.index];
            this.index += 2;

            if (this.index % 2 == 0 && this.index >= numbers.length) {
                this.index = 1;
            }

            return element;
        }
    }
}
