import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList {

    public Object getRandomElement(ArrayList<Object> arrayList) {
        Random random = new Random();
        Object object = arrayList.get(random.nextInt(arrayList.size()));
        arrayList.remove(object);
        return object;
    }
}
