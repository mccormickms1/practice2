public class Cylinder {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    private double getRadius() {
        return this.radius;
    }

    private double getHeight() {
        return this.height;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }
    
    private void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return (Math.PI * radius * radius * height);
    }

    public double surfaceArea() {
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }
}