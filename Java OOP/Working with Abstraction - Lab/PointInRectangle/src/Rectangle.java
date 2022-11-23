public class Rectangle {

    int bottomLeftX;
    int bottomLeftY;
    int topRightX;
    int topRightY;

    public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY) {
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

    public boolean contains(Point point) {
        if ((point.x == this.bottomLeftX || point.x == this.topRightX) && (point.y >= this.bottomLeftY && point.y <= this.topRightY)) {
            return true;
        } else return ((point.y == this.bottomLeftY || point.y == this.topRightY) && (point.x >= this.bottomLeftX && point.x <= this.topRightX));
    }
}
