public class Rebel implements Buyer{

    private String name;
    private int age;
    private String group;
    private static final int DEFAULT_AMOUNT_FOOD_PEY_BUY = 5;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    @Override
    public void buyFood() {
        Food.TOTAL_FOOD_AMOUNT_PURCHASED += DEFAULT_AMOUNT_FOOD_PEY_BUY;
    }

}
