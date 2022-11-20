public class Car {

    private String model;
    private double fuelAmount;
    private double fuelCostPerKilometer;
    private int distance;

    public Car(String model, double fuelAmount, double fuelCostPerKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKilometer = fuelCostPerKilometer;
        this.distance = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostPerKilometer() {
        return fuelCostPerKilometer;
    }

    public void setFuelCostPerKilometer(double fuelCostPerKilometer) {
        this.fuelCostPerKilometer = fuelCostPerKilometer;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void moveCar(int inputDistance) {
        double fuelNeeded = inputDistance * this.getFuelCostPerKilometer();

        if (this.getFuelAmount() >= fuelNeeded) {
            this.setFuelAmount(this.getFuelAmount() - fuelNeeded);
            this.setDistance(this.getDistance() + inputDistance);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.getModel(), this.getFuelAmount(), this.getDistance());
    }
}
