package assign2;

import java.util.Arrays;

public class BinaryRepresentation
{
	private int[] mantissa;
	private int[] exponent;
	private int sign;
	private int[] binary;
	private int toThe;
	
	// get set modifiers for stuff
	public BinaryRepresentation()
	{
		// no argument constructor
	}
	public BinaryRepresentation(int[] mantissa, int[] exponent, int sign)
	{
		this.mantissa = mantissa;
		this.exponent = exponent;
		this.sign = sign;
	}
	public int[] getMantissa()
	{
		return mantissa;
	}
	public void setMantissa(int[] mantissa)
	{
		this.mantissa = mantissa;
	}
	public int[] getExponent()
	{
		return exponent;
	}
	public void setExponent(int[] exponent)
	{
		this.exponent = exponent;
	}
	public int getSign()
	{
		return sign;
	}
	public void setSign(int sign)
	{
		this.sign = sign;
	}
	
	public void setToThe(int shifts)
	{
		this.toThe = shifts;
	}
	
	public int getToThe()
	{
		return toThe;
	}
	
	public void setBinary(int sign, int[] exponent, int[] mantissa)
	{
		int[] binary = new int[8];
		binary[0] = sign;
		for(int i = 1; i < 5; i++)
		{
			binary[i] = this.exponent[i-1];
		}
		for(int i = 5; i< 8; i++)
		{
			binary[i] = mantissa[i-5];
		}
		this.binary = binary;
	}
	public int[] getBinary()
	{
		return binary;
	}
	
	public void displayValues()
	{
		System.out.println(this.sign + " " + Arrays.toString(this.mantissa) + "*2^" + this.toThe);
	}
}
