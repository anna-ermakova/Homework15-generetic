import java.util.Objects;

abstract public class Transport {

    protected boolean passDiagnostics;
    private String brand;
    private String model;
    private double engineCapacity;

    abstract void startMoving();


    abstract void finishMoving();

    public static void checkTransport(Transport... transports) {
        int count = 0;
        for (Transport transport : transports) {
            if (!transport.isDiagnosticsPassed()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                count++;
            }
        }
        System.out.println("Диагностику прошли " + count + " из " + transports.length + " автомобилей.");
    }


    public Boolean getPassDiagnostics() {
        return passDiagnostics;
    }

    public abstract boolean isDiagnosticsPassed();

    abstract void printType();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = validateStringParameters(brand);
        this.model = validateStringParameters(model);
        this.engineCapacity = validateDoubleParameters(engineCapacity);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() +
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

    public String validateStringParameters(String value) {
        return value == null || value.isBlank() ? "default" : value;
    }

    public int validateIntParameters(int value) {
        return value == 0 ? 0 : Math.abs(value);
    }

    public double validateDoubleParameters(double value) {
        return value == 0 ? 0 : Math.abs(value);
    }
}