package as2;
//circle class subclass of geo object 
public class Circle extends GeoObject
{
	// declare data fields
	private double x, y;
	private double radius;
	private String type = "Circle";

	// no argument constructor
	public Circle()
	{
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	// constructor for when values are passed
	public Circle(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// methods to get / set radius
	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
		
	@Override
	public double getArea()
	{
		// ((pi)r^2)
		return Math.PI*(radius * radius);
	}
	
	@Override
	public double getPerimeter()
	{
		// 2(pi)r
		return 2*Math.PI*radius;
	}
	// implemented method for making it easier to identify which object I am referring to in print out
	@Override
	public String getType()
	{
		return this.type;
	}




}
