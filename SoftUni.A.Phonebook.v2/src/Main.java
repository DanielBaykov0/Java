import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();
        Queue<String> forSearch = new ArrayDeque<>();
        String temp;

        do {
            temp = scanner.nextLine();
            if (temp.equals("search")){
                continue;
            }else {
                String[] nameAndNum = temp.split("-");
                phonebook.put(nameAndNum[0], nameAndNum[1]);
            }
        }while (!temp.equals("search"));

        do {
            temp = scanner.nextLine();
            if (temp.equals("stop")){
                continue;
            }else {
                forSearch.add(temp);
            }
        }while (!temp.equals("stop"));

        do {
            //temp = forSearch.poll();
            if(forSearch.isEmpty())
                continue;
            if (phonebook.containsKey(forSearch.peek())){
                System.out.printf("%s -> %s\n", forSearch.peek(), phonebook.get(forSearch.poll()));
            }else {
                System.out.printf("Contact %s does not exist.\n", forSearch.poll());
            }
        }while (!forSearch.isEmpty());

    }
}