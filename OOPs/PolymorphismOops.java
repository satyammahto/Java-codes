package OOPs;

//Compiletime --> Method overloading
//RunTime --> Method overriding
  class Shape{
	  void draw() {
		  System.out.println("Draws a shape");
	  }
  }
   class Circle extends Shape{
	   @Override
	   void draw() {
		   System.out.println("Draws a circle");
	   }
   }
   class Square extends Shape{
	   @Override
	   void draw() {
		   System.out.println("Draws a Square");
	   }
   }
 
public class PolymorphismOops {

	public static void main(String[] args) {
		Shape[] shapes = {new Circle(),new Square()};
	  for(Shape s:shapes) {
		  s.draw();
	  }
	}
}
