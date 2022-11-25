public class SportCar extends Car{

    private final static double DEFAULT_FUEL_CONSUMPTION = 10;
    private double fuelConsumption;

    public SportCar(double fuel, int horsePower) {
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
