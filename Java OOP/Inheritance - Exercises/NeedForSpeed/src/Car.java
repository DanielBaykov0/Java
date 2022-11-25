public class Car extends Vehicle{

    private final static double DEFAULT_FUEL_CONSUMPTION = 3;
    private double fuelConsumption;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    @Override
    public void drive(double kilometers) {
        if (kilometers * this.fuelConsumption < this.getFuel()) {
            this.setFuel(this.getFuel() - (kilometers * this.fuelConsumption));
        }
    }
}
