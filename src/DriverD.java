public class DriverD<T extends Bus> extends Driver {
    public DriverD(String name) {
        super(name);
    }

    public String getCarMessage(T bus) {
        return "водитель " + getName() + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() +
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
