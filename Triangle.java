public class Triangle{
private double sideA=0, sideB=0, sideC=0, height=0;
public Triangle(double sideAT, double sideBT, double sideCT, double heightT){
  this.sideA = sideAT;
  this.sideB = sideBT;
  this.sideC = sideCT;
  this.height = heightT;
}
public void perimeter(){
 double perimeter = sideA + sideB + sideC;
 System.out.println("Tirangle perimeter = "+ perimeter); 
}

public void area(){
double area = 0.5 * sideB * height;
System.out.println("Triangle area = "+ area); 
}
}