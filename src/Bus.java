public class Bus extends Transport implements Competing {
    public enum SeatCapacity {
        EXTRA_SMALL(0, 10), SMALL(11, 40), MEDIUM(41, 60), BIG(61, 80), EXTRA_BIG(81, 120);

        SeatCapacity() {
        }

        int min;
        int max;

        SeatCapacity(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public static SeatCapacity getValue(int value) {
            for (SeatCapacity e : SeatCapacity.values()) {
                if (value >= e.getMin() && value <= e.getMax()) {
                    System.out.println(e);
                    return e;
                }
            }
            return null;
        }

        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }
    }

    private final double bestLapTime;
    private final double topSpeed;
    private final SeatCapacity capacity;
    private DriverD driver;

    static class DriverD extends Driver{
        public DriverD(String name) {
            super(name);
        }

        public String getBusMessage() {
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


    @Override
    void startMoving() {
        System.out.println("Автобус "+getBrand()+" начал движение.");
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
    public boolean repair() {
        return false;
    }

    @Override
    void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("ok");
        }
    }

    public Bus(String brand, String model, double engineCapacity, double bestLapTime, double topSpeed, SeatCapacity capacity, DriverD driver, Mechanic mechanic, Sponsor sponsor) {
        super(brand, model, engineCapacity);
        this.bestLapTime = validateDoubleParameters(bestLapTime);
        this.topSpeed = validateDoubleParameters(topSpeed);
        this.capacity = capacity;
        this.driver = driver;
        this.getMechanics();
        this.getSponsors();

    }

    @Override
    public String toString() {
        return "Автобус с водителем " + driver + "\n" + super.toString();
    }

    @Override
    public void getPitStop() {
        System.out.println("Автобус сообщил о пит-стопе.");
        System.out.println("Автобус принимает манипуляции на пит-стопе.");
        System.out.println("Автобус вернулся на трассу.");
    }

    public void setDriver(DriverD driver) {
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
