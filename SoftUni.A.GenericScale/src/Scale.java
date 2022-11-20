public class Scale<T extends Comparable> {

    T left;
    T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    T getHeavier() {
        if (left == right) {
            return null;
        }

        int compare = this.left.compareTo(this.right);
        if (compare > 0) {
            return left;
        } else {
            return right;
        }
    }
}
