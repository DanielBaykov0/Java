import java.util.ArrayList;

public class StackOfStrings implements IStackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    @Override
    public void push(String item) {
        data.add(item);
    }

    @Override
    public String pop() {
        return data.remove(data.size() - 1);
    }

    @Override
    public String peek() {
        return data.get(data.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
