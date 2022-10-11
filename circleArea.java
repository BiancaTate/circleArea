package circleArea;
import java.util.*;

public class circleArea {
	public static void main( String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter a Radius: ");
		double radius= input.nextDouble(); // user inputs number for radius
		double area=Math.PI*(radius*radius);            // formula for Area of a circle 
		double perimeter= 2*Math.PI*radius;         // formula for Perimeter of a circle 
		
		System.out.println("The results for Perimeter and Area");
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
		

		input.close();
	

		
	}
	

}
