package as2;
//rectangle triangle class subclass of geo object 
public class Rectangle extends GeoObject
{
	// declare data fields
	private double side1,side2;
	private String type = "Rectangle";
	
	// no arg constructor/ base case
	public Rectangle()
	{
		side1 = 1;
		side2 = 1;
	}
	
	// constructor for when values are passed
	public Rectangle(double side1, double side2)
	{
		this.side1 =side1;
		this.side2 = side2;
	}
	
	// methods for printing the area and the perimeter
	@Override
	public double getArea()
	{
		double area;
		
		area = getSide1()*side2;
		
		return area;
	}
	
	@Override
	public double getPerimeter()
	{
		double perimeter;
		
		perimeter = (getSide1() + side2) *2;
		
		return perimeter;
	}
	
	// implemented method for making it easier to identify which object I am referring to in print out
	public String getType()
	{
		return this.type;
	}
	
	// get / set modifiers for the sides
	public double getSide1()
	{
		return side1;
	}

	public void setSide1(double side1)
	{
		this.side1 = side1;
	}
	public double getSide2()
	{
		return side1;
	}

	public void setSide2(double side1)
	{
		this.side1 = side1;
	}


}
