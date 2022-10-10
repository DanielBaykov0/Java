public class Vehicle {

    private String typeOfVehicle;
    private String modelOfVehicle;
    private String colorOfVehicle;
    private int horsepowerOfVehicle;

    public Vehicle(String typeOfVehicle, String modelOfVehicle, String colorOfVehicle, int horsepowerOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        this.modelOfVehicle = modelOfVehicle;
        this.colorOfVehicle = colorOfVehicle;
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getModelOfVehicle() {
        return modelOfVehicle;
    }

    public void setModelOfVehicle(String modelOfVehicle) {
        this.modelOfVehicle = modelOfVehicle;
    }

    public String getColorOfVehicle() {
        return colorOfVehicle;
    }

    public void setColorOfVehicle(String colorOfVehicle) {
        this.colorOfVehicle = colorOfVehicle;
    }

    public int getHorsepowerOfVehicle() {
        return horsepowerOfVehicle;
    }

    public void setHorsepowerOfVehicle(int horsepowerOfVehicle) {
        this.horsepowerOfVehicle = horsepowerOfVehicle;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d", this.getTypeOfVehicle(), this.getModelOfVehicle(),
                this.getColorOfVehicle(), this.getHorsepowerOfVehicle());
    }
}
