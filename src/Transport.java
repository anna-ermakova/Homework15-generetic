import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract public class Transport {

    protected boolean passDiagnostics;
    private String brand;
    private String model;
    private double engineCapacity;
    private final List<Sponsor[]> sponsors;
    private final List<Mechanic<?>[]> mechanics;


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

    public abstract boolean repair();

    abstract void printType();

    public Transport(String brand, String model, double engineCapacity) {
        this.brand = validateStringParameters(brand);
        this.model = validateStringParameters(model);
        this.engineCapacity = validateDoubleParameters(engineCapacity);
        this.sponsors = new ArrayList<Sponsor[]>();
        this.mechanics = new ArrayList<Mechanic<?>[]>();

    }

    public List<Sponsor[]> getSponsors() {
        return sponsors;
    }

    public void addSponsor(Sponsor... sponsor) {
        sponsors.add(sponsor);
    }

    public void addMechanic(Mechanic<?>... mechanic) {
        mechanics.add(mechanic);
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

    public List<Mechanic<?>[]> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (!sponsors.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsors.size(); i++) {
            result.append(sponsors.get(i));
            if (i != sponsors.size() - 1) {
                result.append(", ");
            }
        }
        result.append("\n");
        if (!mechanics.isEmpty()) {
            result.append("Механики: ");
        }
        for (int i = 0; i < mechanics.size(); i++) {
            result.append(mechanics.get(i));
            if (i != mechanics.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Transport transport = (Transport) o;
            return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
        }

        @Override
        public int hashCode () {
            return Objects.hash(brand, model, engineCapacity);
        }

        public String validateStringParameters (String value){
            return value == null || value.isBlank() ? "default" : value;
        }

        public int validateIntParameters ( int value){
            return value == 0 ? 0 : Math.abs(value);
        }

        public double validateDoubleParameters ( double value){
            return value == 0 ? 0 : Math.abs(value);
        }
    }
