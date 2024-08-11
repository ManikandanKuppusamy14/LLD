package Two.Rectangular;

import Two.Point.Point;

public class Rectangular {
    Point topLeft;
    int height;
    int width;

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2 * (height * width);
    }

    public Point getBottomRight() {
        Point bottomRight = new Point();
        bottomRight.x = topLeft.x + width;
        bottomRight.y = topLeft.y - height;

        return bottomRight;
    }
}

