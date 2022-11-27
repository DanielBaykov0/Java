import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line;
        while (!(line = scanner.nextLine()).equals("HARVEST")) {
            Field[] fields = harvestFieldsByGivenModifier(line);
            printFields(fields);
        }
    }

    private static void printFields(Field[] fields) {
        Arrays.stream(fields)
                .forEach(field -> {
                    System.out.println(String.format("%s %s %s",
                            Modifier.toString(field.getModifiers()),
                            field.getType().getSimpleName(),
                            field.getName()));
                });
    }

    private static Field[] harvestFieldsByGivenModifier(String modifier) {
        Class<?> rich = RichSoilLand.class;
        Field[] fields = null;

        switch (modifier) {
            case "private":
                fields = Arrays.stream(rich.getDeclaredFields())
                        .filter(field -> Modifier.isPrivate(field.getModifiers()))
                        .toArray(Field[]::new);
                break;
            case "public":
                fields = Arrays.stream(rich.getDeclaredFields())
                        .filter(field -> Modifier.isPublic(field.getModifiers()))
                        .toArray(Field[]::new);
                break;
            case "protected":
                fields = Arrays.stream(rich.getDeclaredFields())
                        .filter(field -> Modifier.isProtected(field.getModifiers()))
                        .toArray(Field[]::new);
                break;
            case "all":
                fields = Arrays.stream(rich.getDeclaredFields()).toArray(Field[]::new);
                break;
        }

        return fields;
    }
}