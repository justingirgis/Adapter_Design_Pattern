

public class RectangleAdapter implements OldRectangle{
    private NewRectangle newRectangle;

    public RectangleAdapter(Point first, Point second, Point third, Point fourth){
        double length = first.getDistance(fourth);
        double width = first.getDistance(second);
        newRectangle = new NewRectangle(first, width, length);
    }

    @Override
    public double getArea() {
        return newRectangle.getArea();
    }

    @Override
    public double getPerimeter() {
        return newRectangle.getPerimeter();
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(Math.pow(newRectangle.getLength(), 2)
                        + Math.pow(newRectangle.getWidth(),2));

        //return newRectangle.getUpperLeft().getDistance(newRectangle.getUpperLeft());
    }

    @Override
    public Point[] getCorners() {
        Point [] points = new Point[4];
        Point upperLeft = newRectangle.getUpperLeft();
        points[0] = upperLeft;
        points[1] = new Point(upperLeft.getX()+newRectangle.getWidth(),
                                upperLeft.getY()); // upper right corner
        points[2] = new Point(points[1].getX(), points[1].getY()-newRectangle.getLength());//bottom right corner
        points[3] = new Point(upperLeft.getX(), upperLeft.getY()-newRectangle.getLength());//bottom left corner
        return points;
    }
}
