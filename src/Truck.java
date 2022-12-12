public class Truck extends Transport implements Competing {

    private final double bestLapTime;
    private final double topSpeed;
    private Weight weight;
    private DriverC driver;


    public Weight getWeight() {
        return weight;
    }

    @Override
    void startMoving() {
        System.out.println("Начать движение грузового автомобиля");
    }

    @Override
    void finishMoving() {
        System.out.println("Закончить движение грузового автомобиля");
    }

    @Override
    public boolean isDiagnosticsPassed() {
        return this.passDiagnostics;
    }

    @Override
    public boolean repair() {
        return false;
    }

    @Override
    void printType() {

    }


    public Truck(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed, Weight weight, DriverC driver) {
        super(brand, model, engineCapacity);
        this.bestLapTime = validateDoubleParameters(bestLapTime);
        this.topSpeed = validateDoubleParameters(topSpeed);
        this.weight = weight;
    }
    public String toString() {
        return "Грузовик с водителем "+driver+"\n"+super.toString();
    }
    @Override
    public void getPitStop() {
        System.out.println("Грузовой автомобиль сообщил о пит-стопе.");
        System.out.println("Грузовой автомобиль принимает манипуляции на пит-стопе.");
        System.out.println("Грузовой автомобиль вернулся на трассу.");
    }

    public void setDriver(DriverC driver) {
        this.driver = driver;
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга- " + bestLapTime);
    }

    @Override
    public void getTopSpeed() {
        System.out.println("Максимальная скорость- " + topSpeed);
    }
}
