public class Floor {

    // Instance Fields.
    private double width;
    private double length;

    // Parameterized Constructor.
    public Floor(double width, double length) {
        // Checks for invalid value.
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }
}
