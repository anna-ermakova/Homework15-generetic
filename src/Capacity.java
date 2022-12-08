public enum Capacity {
    EXTRA_SMALL(0, 10),
    SMALL(11, 40),
    AVERAGE(41, 60),
    BIG(61, 80),
    EXTRA_BIG(81, 120);

    Capacity() {

    }

    int min;
    int max;

    Capacity(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Capacity getValue(int value) {
        for (Capacity e : Capacity.values()) {
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
