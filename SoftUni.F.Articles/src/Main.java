import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] articles = sc.nextLine().split(", ");

        int n = Integer.parseInt(sc.nextLine());

        Article article = new Article(articles[0], articles[1], articles[2]);

        for (int i = 0; i < n; i++) {
            articles = sc.nextLine().split(": ");

            switch (articles[0]) {
                case "Edit":
                    Article.editContent(articles[1]);
                    break;
                case "ChangeAuthor":
                    Article.changeAuthor(articles[1]);
                    break;
                case "Rename":
                    Article.rename(articles[1]);
                    break;
            }
        }

        System.out.println(article);
    }
}