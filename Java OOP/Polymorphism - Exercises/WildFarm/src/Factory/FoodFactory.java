package Factory;

import Foods.Food;
import Foods.Meat;
import Foods.Vegetable;
import IO.ConsoleIO;
import Util.ConfigConstants;
import Util.ConfigExMessage;

public class FoodFactory {

    private FoodFactory() {
    }

    public static Food produceFood(ConsoleIO consoleIO) {
        String[] foodTokens = consoleIO.readLine().split("\\s+");
        String type = foodTokens[ConfigConstants.TYPE_INDEX];
        int quantity = Integer.parseInt(foodTokens[ConfigConstants.QUANTITY_INDEX]);

        switch (type) {
            case ConfigConstants.FOOD_TYPE_VEGETABLE:
                return new Vegetable(quantity);
            case ConfigConstants.FOOD_TYPE_MEAT:
                return new Meat(quantity);
            default:
                throw new IllegalArgumentException(ConfigExMessage.INVALID_FOOD_TYPE_EX_MESSAGE);
        }
    }
}
