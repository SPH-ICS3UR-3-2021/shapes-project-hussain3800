public class Cone{
private double radius=0, height=0;
public Cone(double radiusC, double heightC){
  this.radius = radiusC ;
  this.height = heightC;
  
  
}
public void surfaceArea(){
double surfaceArea = Math.PI * radius *(radius + Math.sqrt(height * height + radius*radius));
System.out.println("Cone Surface Area = " + surfaceArea);
}

public void volume(){
double volume = (Math.PI * radius * radius * height) / 3;
System.out.println("Cone volume = " + volume);
System.out.println("");
}

}
