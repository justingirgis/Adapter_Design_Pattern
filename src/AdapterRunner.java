public class AdapterRunner {
    public static void main(String[]args) {

        OldRectangle oldRectangle = new RectangleAdapter(
                new Point(0,10), new Point(6, 10),
                new Point(6, 0), new Point(0,0));

        Point [] points = oldRectangle.getCorners();
        System.out.println("Area: " + oldRectangle.getArea()  + "\nGet Diagonal: "
                            + oldRectangle.getDiagonal() + "\nGet Perimeter: "
                            + oldRectangle.getPerimeter() + "\n");

        for(Point point: points) {
            System.out.println(point.toString());
        }

    }
}
