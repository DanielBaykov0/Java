import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));

        Class<?> reflection = Reflection.class;

        Method[] methods = reflection.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                setters.add(method);
            } else if (method.getName().startsWith("get")) {
                getters.add(method);
            }
        }

        System.out.println("Setters:");
        setters.forEach(setter -> {
            System.out.println(String.format("%s %s",
                    setter.getName(), setter.getReturnType().getSimpleName()));
        });
        System.out.println();
        System.out.println("Getters:");
        getters.forEach(getMethod -> {
            System.out.println(String.format("%s %s",
                    getMethod.getName(),
                    getMethod.getReturnType().getSimpleName()));
        });
    }
}