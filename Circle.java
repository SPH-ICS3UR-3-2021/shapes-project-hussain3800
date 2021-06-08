public class Circle {
private double radius =0;
  public Circle(double radiusC){
    this.radius = radiusC;
  }
  public void circumfrence(){
  double  circumfrence = 2* Math.PI * radius;
  System.out.println("Circumfrence of Circle= "+ circumfrence);
  }

  public void area(){
    double area = Math.PI * radius * radius;
     System.out.println("Area of Circle= "+ area);
      System.out.println("");
  }
}