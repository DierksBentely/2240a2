package assign2;

public class Binary 
{
	// no argument constructor
	public Binary()
	{
		
	}
	
	// *************************from here to
	// convert the fraction part to base 2 and put in array of size 8 for now
	public int[] fractionPartToBinary(float userInput)
	{
		if (userInput <0)
		{
			userInput=-userInput;
		}
		int intuserInput= (int) userInput;
		float product = userInput- intuserInput;
		float[] expo = new float[8];
		int[] expoInt = new int[8];
		int x=0,y=0;
		
		do
		{
			product = product*2;
			expo[x] =product;
			if (product >=1)
			{
				product=product-1;
				expo[x] =1;
			}
			x++;
			y++;
		} while(y<expo.length);
		
		for (int i = 0; i < expo.length; i++)
		{
			if(expo[i] ==1)
			{
				expoInt[i] =1;
			}
			else
			{
				expoInt[i] =0;
			}
		}
		return expoInt;
	}
	public int countTrailingZeros(int[] bin)
	{
		int zeros= 0;
		for (int i = 0; i < bin.length; i++)
		{
			if (bin[bin.length-1-i] == 0)
			{
				zeros++;
			}
			else
			{
				return zeros;
			}			
		}
		return zeros;
	}
	public int[] removeTrailingZeros(int[] bin)
	{
		int[] minBin = new int[bin.length -1];
		for (int i = 0; i< minBin.length;i++)
		{
			minBin[i] = bin[i];
		}
		return minBin;
	}
	// ************************* here, makes the fraction part of the number its binary representation
	// without the trailing zeros
	
	// *************************from here to
	// convert integer part to base 2 binary in an array of size 15 for now
	public int[] integerPartToBinary(float userInput)
	{
		if (userInput < 0)
		{
			userInput = -userInput;
		}
		int intUserInput = (int) userInput;
		int[] bin = new int[15]; // this is a number that will allow for x^15
		int x =0;
		int placeholder;
		while (intUserInput >0)
		{
			bin[x] = intUserInput%2;
			x++;
			if (intUserInput ==1 || intUserInput ==0)
			{
				for (int i =0; i < bin.length/2; i++) 
				{
					placeholder = bin[i];
					bin[i] = bin[bin.length - i - 1];
					bin[bin.length - i - 1] = placeholder;					
				}
			}
			intUserInput = intUserInput/2;
		}
		return bin;
	}
	public int countLeadingZeros(int[] bin)
	{
		int zeros= 0;
		for (int i =0; i < bin.length; i++)
		{
			if (bin[i] == 0)
			{
				zeros++;
			}
			else
			{
				return zeros;
			}
		}
		return zeros;
	}
	public int[] removeLeadingZeros(int[] bin)
	{
		int[] minBin = new int[bin.length-1];
		for(int i =0; i<minBin.length; i++)
		{
			minBin[i] = bin[i+1];
		}
		return minBin;
	}
	// ************************* here, makes the whole number its binary representation
	// without the leading zeros
}
