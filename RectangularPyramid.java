public class RectangularPyramid{
private double length=0, width=0, height=0;

public RectangularPyramid(double lengthRP, double widthRP, double heightRP){
  this.length = lengthRP;
  this.width = widthRP;
  this.height = heightRP;
}

public void surfaceArea(){
double surfaceArea = length*width + length*Math.sqrt((width/2)*(width/2) + (height*height)) + width*Math.sqrt(((length * length)/4) + (height * height));
System.out.println("Rectangular Pyrammid Surface Area = " + surfaceArea);
}
public void volume(){
double volume = (length * width * height) / 3;
System.out.println("Rectangular Pyrammid volume = " + volume);
}
}