package as2;
import java.util.Random;
public class Main 
{
	public static void main(String[] args)
	{
		// creation of array for objects
		GeoObject[] ObjectArray = new GeoObject [5];
		
		// creation of the objects using fixed 5s for every thing
		Circle circle = new Circle(5,5,5);
		Triangle triangle = new Triangle(5,5,5);
		EqTriangle eqTriangle = new EqTriangle(5);
		Rectangle rectangle = new Rectangle (5,5);
		Square square = new Square (5);
		// creating a new random instance so I can randomly assign color/ filled
		Random random = new Random();
		// making an array for the available colors
		String[] availColors = {"green", "blue" , "red" , "yellow" , "orange"};
		
		// adding the objects to the array in their specified positions
		ObjectArray[0] = (circle);
		ObjectArray[1] = (eqTriangle);
		ObjectArray[2] = (triangle);
		ObjectArray[3] = (rectangle);
		ObjectArray[4] = (square);
		
		// for loop passing objects in the array to the method printAreaAndPerimeter()
		for (int i = 0; i < ObjectArray.length; i++)
		{
			// utilizing random to make it filled or not, and with what color
			int x= random.nextInt(availColors.length);
			ObjectArray[i].setColor(availColors[x]);
			boolean y = random.nextBoolean();
			ObjectArray[i].setFilled(y);
			// the calling the method to print all the information about the object
			printAreaAndPerimeter(ObjectArray[i]);
		}
		
	}
	
	
	/*
	 	print area and perimeter method utilizes the objects in the array to print out the information of which object indexed by
	 	the for loop in the main method
	*/
	 
	private static void printAreaAndPerimeter(GeoObject gObject)
	{
		
		// the methods to print out the information about the object
		System.out.println(gObject.toString());
		System.out.println("the area of this " + gObject.getType() + " is "  + gObject.getArea());
		System.out.println("the perimeter of this " + gObject.getType() + " is " + gObject.getPerimeter() + "\n");

		
	}
	
		
	
			
}
