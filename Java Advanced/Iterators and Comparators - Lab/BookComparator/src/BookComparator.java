import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book one, Book two) {
        if (one.getTitle().compareTo(two.getTitle()) == 0) {
            return Integer.compare(one.getYear(), two.getYear());
        }

        return one.getTitle().compareTo(two.getTitle());
    }
}
