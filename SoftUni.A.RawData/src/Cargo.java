public class Cargo {

    private final String type;
    private final int weight;

    public Cargo(int weight, String type) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
