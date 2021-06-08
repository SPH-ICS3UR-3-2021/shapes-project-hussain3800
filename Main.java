
import java.awt.TrayIcon;
import java.io.*;
import java.util.*;
import java.lang.Math.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 while (true)
      {     
    System.out.println("1) Rectangle"); 
    System.out.println("2) Circle"); 
    System.out.println("3) Triangle"); 
    System.out.println("4) Sphere"); 
    System.out.println("5) Rectangular Prism"); 
    System.out.println("6) Rectangular Pyramid"); 
    System.out.println("7) Cone"); 
    System.out.println("8) Exit"); 
    System.out.println("Choice:");
        int choice = scanner.nextInt();
        
         if (choice == 1){
          System.out.println("Enter length and width in separate lines:");
          double length = scanner.nextDouble();
          double width = scanner.nextDouble();
        
          Rectangle rectangle = new Rectangle(length,width);
          rectangle.area();
          rectangle.perimeter();
          }
           else if (choice == 2){
          System.out.println("Enter radius");
          double radius = scanner.nextDouble();
          Circle circle = new Circle(radius);
          circle.circumfrence();
          circle.area();
           }

          else if (choice == 3){
          System.out.println("Enter enter sides A, b, C and height of Trriangle in separate lines:");
          double sideA = scanner.nextDouble();
          double sideB = scanner.nextDouble();
          double sideC = scanner.nextDouble();
          double height = scanner.nextDouble();
          Triangle triangle = new Triangle(sideA, sideB, sideC, height);
          triangle.perimeter();
          triangle.area();          
        }

          else  if (choice == 4){
          System.out.println("Enter radius:");
          double radius = scanner.nextDouble();
          Sphere sphere = new Sphere(radius);
          sphere.surfaceArea();
          sphere.volume(); 
        }

        else if (choice == 5){
          System.out.println("Enter length, width and height in separate lines:");
          double length = scanner.nextDouble();
          double width = scanner.nextDouble();
          double height = scanner.nextDouble();

          RectangularPrism rectangularprism = new RectangularPrism(length,width,height);
          rectangularprism.surfaceArea();
          rectangularprism.volume();

        }

         else if (choice == 6){
          System.out.println("Enter length, width and height in separate lines:");
          double length = scanner.nextDouble();
          double width = scanner.nextDouble();
          double height = scanner.nextDouble();

          RectangularPyramid rectangularpyramid = new RectangularPyramid(length,width,height);
          rectangularpyramid.surfaceArea();
          rectangularpyramid.volume();

        }

        else if (choice == 7){
          System.out.println("Enter radius and height in separate lines:");
          double radius = scanner.nextDouble();
          double height = scanner.nextDouble();

          Cone cone = new Cone(radius,height);
          cone.surfaceArea();
          cone.volume();

        }
            
        else 
          System.exit(0);

  }//end of  while
}
}
