package as2;
// triangle class subclass of geoobject 
class Triangle extends GeoObject
{
	// initializing data fields
	private double side1 = 1.0, side2= 1.0, side3 = 1.0;
	private String type = "Triangle";
	
	// no arg constructor/ base case
	public Triangle()
	{
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	// constructor for when values are passed 
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	// the inherited classes for get area, get perimeter and to string
	@Override
	public double getArea()
	{
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	@Override
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	@Override
	public String toString()
	{
		super.toString();	
		return "Triangle: side 1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
	}
	// implemented method for making it easier to identify which object I am referring to in print out
	@Override
	public String getType()
	{
		return this.type;
	}

}
