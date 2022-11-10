package model;

public class Circle implements IShape {
   private double radius;

   public Circle(double radius) {
      super();
      this.radius = radius;
   }

   @Override
   public double getArea() {
      return 3.14 * radius * radius;
   }

   @Override
   public double getPerimeter() {
      return 2 * 3.14 * radius;
   }
}
