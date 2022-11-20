import java.util.Stack;

public class Jar<T> {

    Stack<T> stack;

    public Jar() {
        stack = new Stack<>();
    }

    void add(T element) {
        stack.push(element);
    }

    T remove() {
        return stack.pop();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
