public class Carpet {

    // Instance Field.
    private double cost;

    // Parameterized Constructor.
    public Carpet(double cost) {
        // Checks for invalid value.
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
