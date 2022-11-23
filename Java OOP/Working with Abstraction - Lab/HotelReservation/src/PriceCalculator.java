public class PriceCalculator {

    double pricePerDay;
    int numberOfDays;
    Season season;
    Discount discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public static double calculate(double pricePerDay, int numberOfDays, Season season, Discount discountType) {
        double sum = 0;
        if (discountType.equals(Discount.VIP)) {
            sum = seasonCalc(pricePerDay, numberOfDays, season) - (seasonCalc(pricePerDay, numberOfDays, season) * 0.2);
        } else if (discountType.equals(Discount.SecondVisit)) {
            sum = seasonCalc(pricePerDay, numberOfDays, season) - (seasonCalc(pricePerDay, numberOfDays, season) * 0.1);
        } else if (discountType.equals(Discount.None)) {
            sum = seasonCalc(pricePerDay, numberOfDays, season);
        }

        return sum;
    }

    private static double seasonCalc(double pricePerDay, int numberOfDays, Season season) {
        double sum = 0;
        if (season.equals(Season.Autumn)) {
            sum = pricePerDay * numberOfDays;
        } else if (season.equals(Season.Spring)) {
            sum = pricePerDay * numberOfDays * 2;
        } else if (season.equals(Season.Winter)) {
            sum = pricePerDay * numberOfDays * 3;
        } else if (season.equals(Season.Summer)) {
            sum = pricePerDay * numberOfDays * 4;
        }

        return sum;
    }
}
