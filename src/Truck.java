public class Truck extends Transport implements Competing {

    private final double bestLapTime;
    private final double topSpeed;
    private Weight weight;

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
    void printType() {

    }


    public Truck(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed, Weight weight ) {
        super(brand, model, engineCapacity);
        this.bestLapTime = validateDoubleParameters(bestLapTime);
        this.topSpeed = validateDoubleParameters(topSpeed);
        this.weight = weight;

    }

    @Override
    public void getPitStop() {
        System.out.println("Грузовой автомобиль сообщил о пит-стопе.");
        System.out.println("Грузовой автомобиль принимает манипуляции на пит-стопе.");
        System.out.println("Грузовой автомобиль вернулся на трассу.");
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
