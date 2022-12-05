public abstract class Driver {
    private final String name;
    private final boolean validDriverLicense;
    private final int drivingExperience;

    public Driver(String name, boolean validDriverLicense, int drivingExperience) {
        this.name = name;
        this.validDriverLicense = validDriverLicense;
        this.drivingExperience = drivingExperience;
    }

    abstract String startMoving();


    abstract String finishMoving();

    abstract String refuelCar();

    public String getName() {
        return name;
    }

    public boolean isValidDriverLicense() {
        return validDriverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

}
