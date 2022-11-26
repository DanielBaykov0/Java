public class Citizen implements Person, Identifiable, Birthable, Buyer{

    private String name;
    private int age;
    private String id;
    private String birthDate;
    private static final int DEFAULT_AMOUNT_FOOD_PER_BUY = 10;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void buyFood() {
        Food.TOTAL_FOOD_AMOUNT_PURCHASED += DEFAULT_AMOUNT_FOOD_PER_BUY;
    }
}
