public class Article {

    private static String title;
    private static String content;
    private static String author;

    public Article(String title, String content, String author) {
        Article.title = title;
        Article.content = content;
        Article.author = author;
    }

    public static void editContent(String newContent) {
        content = newContent;
    }

    public static void changeAuthor(String newAuthor) {
        author = newAuthor;
    }

    public static void rename(String newTitle) {
        title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",
                title, content, author);
    }
}
