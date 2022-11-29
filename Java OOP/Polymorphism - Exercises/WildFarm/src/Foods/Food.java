package Foods;

public abstract class Food {

    private int quantity;

    public Food(int quantity) {
        this.setQuantity(quantity);
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}