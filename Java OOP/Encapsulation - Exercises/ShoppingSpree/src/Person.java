import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be a negative number");
        }
        this.money = money;
    }

    public void addMoneyToBudget(double money) {
        this.setMoney(this.money + money);
    }

    public void buyProduct(Product product) {
        if (this.getMoney() >=  product.getCost()) {
            this.setMoney(this.money - product.getCost());
            products.add(product);
        } else {
            System.out.println(this.getName() + " can't afford " + product.getName());
        }
    }

    @Override
    public String toString() {
        List<String> resultList =
                this.products.stream().map(Product::getName).collect(Collectors.toList());

        return String.format("%s - %s",
                this.getName(),
                resultList.size() > 0 ? String.join(", ", resultList) : "Nothing bought");
    }
}
