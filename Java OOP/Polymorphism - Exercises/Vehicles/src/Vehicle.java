public abstract class Vehicle {

    private double fuelQuantity;
    private double litersPerKm;

    public Vehicle(double fuelQuantity, double litersPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setLitersPerKm(litersPerKm);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public abstract String drive(double distance);
    public abstract void refuel(double liters);
}
