public class PassengerCar extends Transport implements Competing {
    private final double bestLapTime;
    private final double topSpeed;

    @Override
    void startMoving() {
        System.out.println("Начать движение легкового автомобиля");
    }

    @Override
    void finishMoving() {
        System.out.println("Закончить движение легкового автомобиля");
    }

    public PassengerCar(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed) {
        super(brand, model, engineCapacity);
        this.bestLapTime = validateDoubleParameters(bestLapTime);
        this.topSpeed = validateDoubleParameters(topSpeed);
    }


    @Override
    public void getPitStop() {
        System.out.println("Легковой автомобиль сообщил о пит-стопе.");
        System.out.println("Легковой автомобиль принимает манипуляции на пит-стопе.");
        System.out.println("Легковой автомобиль вернулся на трассу.");
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

