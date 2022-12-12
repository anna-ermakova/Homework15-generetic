public class DriverC<T extends Truck> extends Driver {
    public DriverC(String name) {
        super(name);
    }

    public String getPCarMessage(T truck) {
        return "водитель " + getName() + " управляет грузовым автомобилем " + truck.getBrand() + " " + truck.getModel() +
                " и будет участвовать в заезде.";
    }

    @Override
    String startMoving() {
        return null;
    }

    @Override
    String finishMoving() {
        return null;
    }

    @Override
    String refuelCar() {
        return null;
    }
}
