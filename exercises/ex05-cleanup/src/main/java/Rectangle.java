/**
 * This class represent a rectangle with width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * The constructer of this rectangle.
   *
   * @param w the width of this rectangle
   * @param h the height of this rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Return the area of the rectangle.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the multiplier applied to the rectangle
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns true iff this rectangle is larger than the other rectangle.
   *
   * @param other the other rectangle
   * @return true when this rectangle is larger than the other rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
