import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{

    String title;
    int year;
    List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book o) {
        if (this.title.compareTo(o.title) < 0) {
            return 1;
        } else if (this.title.compareTo(o.title) > 0){
            return -1;
        }

        return Integer.compare(this.getYear(), o.getYear());
    }

    @Override
    public String toString() {
        return String.format("Book Title: %s Year: %d Authors: %s",
                this.getTitle(),
                this.getYear(),
                String.join(", ", this.getAuthors()));
    }
}
