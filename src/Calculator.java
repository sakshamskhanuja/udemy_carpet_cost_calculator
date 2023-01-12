public class Calculator {

    // Instance Fields.
    private Floor floor;
    private Carpet carpet;

    // Parameterized Constructor.
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
