public abstract class Vehicle {

    private double fuelQuantity;
    private double litersPerKm;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double litersPerKm, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitersPerKm(litersPerKm);
        this.setTankCapacity(tankCapacity);
    }

    public double getTankCapacity() {
        return this.tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (fuelQuantity > this.getTankCapacity()) {
            throw new IllegalArgumentException("Fuel quantity cannot be negative!");
        }

        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKm() {
        if (litersPerKm < 0) {
            throw new IllegalArgumentException("Fuel quantity cannot be negative!");
        }

        return litersPerKm;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public abstract String drive(double distance);
    public abstract String drive(double distance, boolean isEmpty);
    public abstract void refuel(double liters);
}
