package as2;

// major class of geo object from which all other classes (except main) are derived
public abstract class GeoObject 
{
	// intializing the data fields for each geometric object
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// no arg constructor (base case)
	protected GeoObject()
	{
		dateCreated = new java.util.Date();
		this.color = "empty";
		this.filled = false;
	}
	
	// constructor to set color and whether it is filled or not
	protected GeoObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	// get / set modifiers for the data fields
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;		
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	
	// print method
	@Override
	public String toString()
	{
		return "created on " + dateCreated + "\ncolor: " + color + " filled: " + filled;
	}
	
	// abstract classes for the child classes
	public abstract String getType();
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
