import java.util.List;

public class Topping {

    private String toppingType;
    private double weight;
    private static final List<String> toppings = List.of("Meat", "Veggies", "Cheese", "Sauce");
    private static final int CALORIES_PER_GRAM = 2;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public void setToppingType(String toppingType) {
        if (!toppings.contains(toppingType)) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight < 0 || weight > 50) {
            throw new IllegalArgumentException(this.getToppingType() + " weight should bein the range [1..50].");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getToppingType() {
        return toppingType;
    }

    public double getCalories() {
        return calculateCalories();
    }

    private double calculateCalories() {
        double toppingModifier = Modifiers.TOPPINGS_MODIFIERS.get(this.getToppingType());

        return CALORIES_PER_GRAM * this.getWeight() * toppingModifier;
    }
}
