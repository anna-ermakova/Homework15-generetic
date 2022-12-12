public class DriverB<T extends PassengerCar> extends Driver {
    public DriverB(String name) {
        super(name);
    }

    @Override
    String startMoving() {
        return "Начать движение";
    }

    @Override
    String finishMoving() {
        return "Завершить движение";
    }

    @Override
    String refuelCar() {
        return "Заправить автомобиль";
    }

    public String getCarMessage(T passengerCar) {
        return "водитель " + getName() + " управляет автомобилем " + passengerCar.getBrand() + " " + passengerCar.getModel() +
                " и будет участвовать в заезде.";
    }
}
