public abstract class Driver {
    private final String name;
    // private final boolean validDriverLicense;
    //private final int drivingExperience;
    public boolean isValidDriverLicense;

    public Driver(String name, int drivingExperience) {
        this.name = name;

       // this.drivingExperience = drivingExperience;
    }

    public Driver(String name, int drivingExperience, boolean isValidDriverLicense) {
        this.name = name;
      //  this.drivingExperience = drivingExperience;
        this.isValidDriverLicense = isValidDriverLicense;
    }

    public Driver(String name) {
        this.name = name;
    }

    public static boolean isValidateLicense(Boolean value) throws NoLicenceException {
        if (value == null || !value) {
            throw new NoLicenceException("Лицензия не указана");
        }
        return value;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
         //       ", drivingExperience=" + drivingExperience +
          //      ", isValidDriverLicense=" + isValidDriverLicense +
                '}';
    }

    abstract String startMoving();


    abstract String finishMoving();

    abstract String refuelCar();

    public String getName() {
        return name;
    }


   // public int getDrivingExperience() {
   //     return drivingExperience;
  //  }

}
