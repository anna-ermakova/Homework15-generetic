public class PassengerCar extends Transport implements Competing {
    private final double bestLapTime;
    private final double topSpeed;
    private final TypeOfBody typeOfBody;

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    @Override
    void startMoving() {
        System.out.println("Начать движение легкового автомобиля");
    }

    @Override
    void finishMoving() {
        System.out.println("Закончить движение легкового автомобиля");
    }

    @Override
    public boolean isDiagnosticsPassed() {
        return this.passDiagnostics;
    }


    @Override
    void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип авто- "+typeOfBody);
        }
    }

    public PassengerCar(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed, TypeOfBody typeOfBody) {
        super(brand, model, engineCapacity);
        this.bestLapTime = bestLapTime;
        this.topSpeed = topSpeed;
        this.typeOfBody=typeOfBody;
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

