public class RectangularPrism{
private double length=0, width=0, height=0;

  public RectangularPrism(double lengthRP, double widthRP, double heightRP){
    this.length = lengthRP;
    this.width = widthRP;
    this.height = heightRP; 
  }  

public void surfaceArea(){
double surfaceArea =  2 * (width*length + height*length + height*width);
System.out.println("Rectangular Prism Surface Area = " + surfaceArea);
}

public void volume(){
double volume = length * width * height;
System.out.println("Rectangular Prism Volume = " + volume);
System.out.println("");
}
}