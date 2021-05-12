class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String coler, boolean filled) {
        super(coler, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * Math.PI * 2;
    }

    @Override
    public String toString() {
        return "A Square with side=" + radius +
                ", which is a subclass of " +
                super.toString();
    }
}
