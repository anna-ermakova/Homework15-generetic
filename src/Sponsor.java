class Sponsor  {

    private final String name;
    private double sum;
    public void doSponsor() {
    sum=0;
    }
    public Sponsor(String name, double sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}