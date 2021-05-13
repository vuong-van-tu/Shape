class Retangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Retangle(){}
    public Retangle(double width ,double length){
        this.width = width;
        this.length = length;
    }
    public Retangle(double width,double length,String coler, boolean filled){
        super(coler, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "\nA Rectangle with width=" +width +
                "and " + "length=" +length+
                " which is a subclass of"+super.toString();
    }
}
