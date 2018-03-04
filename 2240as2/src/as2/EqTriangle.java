package as2;
//equilateral triangle class subclass of geo object & triangle classes
public class EqTriangle extends Triangle
{
	// declare data fields
	private double side;
	private String type = "Equilateral Triangle";
	
	public EqTriangle()
	{
		// no argument constructor
		this.setSide(1);
	}
	// call parent class to set all sides = the one side
	public EqTriangle(double side)
	{
		super(side, side, side);
	}
	
	// get set modifiers for the side field

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// implemented method for making it easier to identify which object I am referring to in print out
	@Override
	public String getType()
	{
		return this.type;
	}

	
	
	
}
