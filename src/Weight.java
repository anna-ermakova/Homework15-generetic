public enum Weight {
    N1(0, 3.4),
    N2(3.5, 11.9),
    N3(12, 500);
    private double min;
    private double max;

    Weight(double min, double max) {
        this.min = min;
        this.max = max;
    }
    Weight() {

    }
    public static Weight getValue(double value) {
        for (Weight e : Weight.values()){
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
