public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean containsPoint(Point p) {
        double distance = Math.sqrt(Math.pow(center.getX() - p.getX(), 2) + Math.pow(center.getY() - p.getY(), 2));
        return distance <= radius;
    }
}
