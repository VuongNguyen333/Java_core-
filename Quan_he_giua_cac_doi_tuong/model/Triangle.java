package model;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
   private Point vertice1;
   private Point vertice2;
   private Point vertice3;

   public Triangle(Point vertice1, Point vertice2, Point vertice3) {
      this.vertice1 = vertice1;
      this.vertice2 = vertice2;
      this.vertice3 = vertice3;
   }
   public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
      this.vertice1 = new Point(x1,y1);
      this.vertice2 = new Point(x2,y2);
      this.vertice3 = new Point(x3,y3);
   }
   public double getPerimeter(){
      double a1 = sqrt(pow(vertice1.getX() - vertice2.getX() , 2) + pow(vertice1.getY() - vertice2.getY() , 2));
      double a2 = sqrt(pow(vertice1.getX() - vertice3.getX() , 2) + pow(vertice1.getY() - vertice3.getY() , 2));
      double a3 = sqrt(pow(vertice3.getX() - vertice2.getX() , 2) + pow(vertice3.getY() - vertice2.getY() , 2));
      return a1 + a3 + a2;
   }
}
