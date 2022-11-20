import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Threeuple> list = new ArrayList<>();

        String[] tokens1 = bufferedReader.readLine().split("\\s+");
        String firstName = tokens1[0];
        String lastName = tokens1[1];
        String address = tokens1[2];
        String town = tokens1[3];
        list.add(new Threeuple<>(firstName + " " + lastName, address, town));

        String[] tokens2 = bufferedReader.readLine().split("\\s+");
        String name = tokens2[0];
        int litersOfBeer = Integer.parseInt(tokens2[1]);
        boolean drunkOrNot = Boolean.parseBoolean(tokens2[2]);
        list.add(new Threeuple<>(name, litersOfBeer, drunkOrNot));

        String[] tokens3 = bufferedReader.readLine().split("\\s+");
        String name1 = tokens3[0];
        double accountBalance = Double.parseDouble(tokens3[1]);
        String bankName = tokens3[2];
        list.add(new Threeuple<>(name1, accountBalance, bankName));

        list.forEach(System.out::println);
    }
}