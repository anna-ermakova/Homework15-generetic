public class Bus extends Transport implements Competing {
    private final double bestLapTime;
    private final double topSpeed;
    private final Capacity capasity;

    public Capacity getCapasity() {
        return capasity;
    }

    @Override
    void startMoving() {
        System.out.println("Начать движение автобуса");
    }

    @Override
    void finishMoving() {
        System.out.println("Законить движение автобуса");
    }

    @Override
    public boolean isDiagnosticsPassed() {
        System.out.println("Автобусы не могут проходить диагностику");
        return false;
    }

    @Override
    void printType() {
        if (capasity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("ok");
        }
    }

    public Bus(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed, Capacity capasity) {
        super(brand, model, engineCapacity);
        this.bestLapTime = validateDoubleParameters(bestLapTime);
        this.topSpeed = validateDoubleParameters(topSpeed);
        this.capasity = capasity;
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
