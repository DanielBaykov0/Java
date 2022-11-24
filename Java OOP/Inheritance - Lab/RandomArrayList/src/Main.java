import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        RandomArrayList randomArrayList = new RandomArrayList();
        System.out.println(randomArrayList.getRandomElement(arrayList));
    }
}