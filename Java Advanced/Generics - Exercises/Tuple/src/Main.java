import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Tuple> list = new ArrayList<>();

        String[] tokens = bufferedReader.readLine().split(" ");
        String firstname = tokens[0];
        String lastName = tokens[1];
        String address = tokens[2];
        list.add(new Tuple<>(firstname + " " + lastName, address));

        String[] tokens2 = bufferedReader.readLine().split(" ");
        String name = tokens2[0];
        int litersOfBeer = Integer.parseInt(tokens2[1]);
        list.add(new Tuple<>(name, litersOfBeer));

        String[] tokens3 = bufferedReader.readLine().split(" ");
        int num = Integer.parseInt(tokens3[0]);
        double d = Double.parseDouble(tokens3[1]);
        list.add(new Tuple<>(num, d));

        list.forEach(System.out::println);
    }
}