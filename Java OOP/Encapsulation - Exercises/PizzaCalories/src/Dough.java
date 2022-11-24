import java.util.List;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;
    private static final List<String> flours = List.of("White", "Wholegrain");
    private static final List<String> technique = List.of("Crispy", "Chewy", "Homemade");
    private static final int CALORIES_PER_GRAM = 2;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    public void setFlourType(String flourType) {
        if (!flours.contains(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    public void setBakingTechnique(String bakingTechnique) {
        if (!technique.contains(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of baking technique");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double getCalories() {
        return calculateCalories();
    }

    private double calculateCalories() {
        double calFlour = Modifiers.DOUGH_MODIFIERS.get(this.getFlourType());
        double calTech = Modifiers.DOUGH_MODIFIERS.get(this.getBakingTechnique());

        return CALORIES_PER_GRAM * this.getWeight() * calFlour * calTech;
    }
}
