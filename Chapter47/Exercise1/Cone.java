public class Cone {
    double radius;
    double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double slantHeight() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }

    public double angle() {
        return Math.atan(radius/height);
    }
}