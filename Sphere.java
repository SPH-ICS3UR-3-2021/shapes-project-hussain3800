public class Sphere{
private double radius=0;

  public  Sphere(double radiusS){
    this.radius = radiusS;
    
    
      }
      public void surfaceArea(){
      double surfaceArea = 4 * Math.PI * radius * radius;
      System.out.println("Sphere Surface Area = " + surfaceArea);
      }
      public void volume(){
      double volume = 0.75 * Math.PI * Math.pow(radius, 3);
      System.out.println("Sphere Volume = " + volume);
      }

}