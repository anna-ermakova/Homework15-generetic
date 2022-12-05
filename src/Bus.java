public class Bus extends Transport implements Competing {
    private final double bestLapTime;
    private final double topSpeed;


    @Override
    void startMoving() {
        System.out.println("Начать движение автобуса");
    }

    @Override
    void finishMoving() {
        System.out.println("Законить движение автобуса");
    }

    public Bus(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed) {
        super(brand, model, engineCapacity);
        this.bestLapTime = validateDoubleParameters(bestLapTime);
        this.topSpeed = validateDoubleParameters(topSpeed);
    }


    @Override
    public void getPitStop() {
        System.out.println("Автобус сообщил о пит-стопе.");
        System.out.println("Автобус принимает манипуляции на пит-стопе.");
        System.out.println("Автобус вернулся на трассу.");
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
