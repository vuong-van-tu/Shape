public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Retangle(4, 6);
        shapes[2] = new Square(7);
        System.out.println("Before resize: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("After resize : ");
        for (Shape shape : shapes) {
            double percent = Math.round(Math.random() * 100 + 1);

            if (shape instanceof Resizeable) {
                System.out.println("Percent is: ");
                System.out.println(percent);
                ((Resizeable) shape).resize(percent);
                System.out.println(shape);
            }
        }

    }

}
