import java.util.Objects;

abstract public class Transport {

    private String brand;
    private String model;
    private double engineCapacity;

    abstract void startMoving();


    abstract void finishMoving();

    public String validateStringParameters(String value) {
        return value == null || value.isBlank() ? "default" : value;
    }

    public int validateIntParameters(int value) {
        return value == 0 ? 0 : Math.abs(value);
    }

    public double validateDoubleParameters(double value) {
        return value == 0 ? 0 : Math.abs(value);
    }

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = validateStringParameters(brand);
        this.model = validateStringParameters(model);
        this.engineCapacity = validateDoubleParameters(engineCapacity);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity);
    }
}