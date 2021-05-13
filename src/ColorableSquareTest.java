public class ColorableSquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5);
        shapes[1] = new Square(3, "red", false);
        shapes[2] = new Square(6, "blue", true);
        for (Shape shape : shapes) {
            System.out.println("Area : " + shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColer();
                System.out.println(shape);

            }
        }
    }
}
