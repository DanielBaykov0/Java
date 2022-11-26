import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone() {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();
    }

    @Override
    public String browse(String url) {
        if (url.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid URL!");
        }

        return String.format("Browsing: %s!", url);
    }

    @Override
    public String call(String phoneNumber) {
        if (phoneNumber.matches(".*\\D.*")) {
            throw new IllegalArgumentException("Invalid number!");
        }

        return String.format("Calling... %s", phoneNumber);
    }
}
