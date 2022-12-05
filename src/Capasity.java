public enum Capasity {
    EXTRA_SMALL(0,10),
    SMALL(11,40),
    AVERAGE(41,60),
    BIG(61,80),
    EXTRA_BIG(81,120);
    Capasity() {

    }
    int min;
    int max;
    Capasity(int min, int max) {
        this.min=min;
        this.max=max;
    }
public static Capasity getValue(int value) {
    for (Capasity e : Capasity.values()) {
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
