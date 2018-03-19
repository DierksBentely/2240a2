package assign2;
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first number to be put in the calculator: ");
		float userInput = scanner.nextFloat();
		System.out.println("enter the second number to be put in the calculator: ");
		float userInput2 = scanner.nextFloat();
		System.out.println("what operation is being performed?: ");
		String userInput3 = scanner.next();
		scanner.close();
		
		switch(userInput3) 
		{
			case "add":
			{
				preAdd(userInput, userInput2);
				break;
			}
			case "subtract":
			{
				preSub(userInput, userInput2);
				break;				
			}
			case "multiply":
			{
				preMul(userInput, userInput2);
				break;
			}
			case "divide":
			{
				preDiv(userInput, userInput2);
				break;
			}
			default:
			{
				System.out.println("I am sorry I do not understand, please try again");
				System.out.println("goodbye -- Program Terminated");
				break;
			}
			
			
			
			
		}
		
		

	}
	public static BinaryRepresentation convert(float userInput)
	{
		Binary binary = new Binary();
		Shifts shifts = new Shifts();
		int shift =0;
		
		BinaryRepresentation binRep = new BinaryRepresentation();
		
		if (userInput > 0)
		{
			binRep.setSign(0);
		}
		else
		{
			binRep.setSign(1);
		}
		// can isolate the integer part and fraction part
		int[] wholeNum = binary.integerPartToBinary(userInput);
		int[] fracNum = binary.fractionPartToBinary(userInput);
		
		// prints the whole and frac num as arrays for troubleshooting purposes
		// System.out.println(Arrays.toString(wholeNum));
		// System.out.println(Arrays.toString(fracNum));
		
		// count leading and trailing zeros
		int zerosFront = binary.countLeadingZeros(wholeNum);
		int zerosEnd = binary.countTrailingZeros(fracNum);
		
		while (zerosFront!=0)
		{
			// removes leading zeros
			wholeNum = binary.removeLeadingZeros(wholeNum);
			zerosFront--;
		}
		while(zerosEnd !=0)
		{
			// remove trailing zeros
			fracNum = binary.removeTrailingZeros(fracNum);
			zerosEnd--;
		}
	
		// actually calculates the whole mantissa for 1 number
		while (wholeNum.length != 1)
		{
			fracNum = shifts.shiftL(wholeNum, fracNum);
			wholeNum = binary.removeTrailingZeros(wholeNum);
			shift++;
		}				
		binRep.setMantissa(fracNum);
		binRep.setToThe(shift);
			
		shift = shift +(7); 
		
		int[] adjExponent = (binary.integerPartToBinary(shift));
		int adjZeros = binary.countLeadingZeros(adjExponent);
		while (adjZeros!=0)
		{
			// removes leading zeros
			adjExponent = binary.removeLeadingZeros(adjExponent);
			adjZeros--;
		}

		binRep.setExponent(adjExponent);
		binRep.setBinary(binRep.getSign(), binRep.getExponent(), binRep.getMantissa());
		
		return binRep;

	}
	
	public static void preAdd(float userInput, float userInput2)
	{		
		BinaryRepresentation binRep1 = new BinaryRepresentation();
		BinaryRepresentation binRep2 = new BinaryRepresentation();
		BinaryRepresentation binRep3 = new BinaryRepresentation();
				
		binRep1 = convert(userInput);
		binRep2 = convert(userInput2);
		binRep3 = convert(userInput + userInput2);
			
		binRep1.displayValues();
		binRep2.displayValues();

		System.out.println("final product is:");
		binRep3.displayValues();

		binRep3.setBinary(binRep3.getSign(), binRep3.getExponent(), binRep2.getMantissa());
		// jam it into an 8 bit format
		System.out.println("in 8 bit format = " + Arrays.toString(binRep3.getBinary()));
	}
	public static void preSub(float userInput, float userInput2)
	{
		BinaryRepresentation binRep1 = new BinaryRepresentation();
		BinaryRepresentation binRep2 = new BinaryRepresentation();
		BinaryRepresentation binRep3 = new BinaryRepresentation();
				
		binRep1 = convert(userInput);
		binRep2 = convert(userInput2);
		binRep3 = convert(userInput - userInput2);

		binRep1.displayValues();
		binRep2.displayValues();
		System.out.println("final product is in standard form :");
		binRep3.displayValues();
		
		binRep3.setBinary(binRep3.getSign(), binRep3.getExponent(), binRep2.getMantissa());
		// jam it into an 8 bit format
		System.out.println("in 8 bit format = " + Arrays.toString(binRep3.getBinary()));
	}
	public static void preMul(float userInput, float userInput2)

	{
		BinaryRepresentation binRep1 = new BinaryRepresentation();
		BinaryRepresentation binRep2 = new BinaryRepresentation();
		BinaryRepresentation binRep3 = new BinaryRepresentation();
				
		binRep1 = convert(userInput);
		binRep2 = convert(userInput2);
		binRep3 = convert(userInput * userInput2);

		binRep1.displayValues();
		binRep2.displayValues();
		System.out.println("final product is ");
		binRep3.displayValues();
		
		binRep3.setBinary(binRep3.getSign(), binRep3.getExponent(), binRep2.getMantissa());
		// jam it into an 8 bit format
		System.out.println("in 8 bit format = " + Arrays.toString(binRep3.getBinary()));
	}
	public static void preDiv(float userInput, float userInput2)
	{
		{
			BinaryRepresentation binRep1 = new BinaryRepresentation();
			BinaryRepresentation binRep2 = new BinaryRepresentation();
			BinaryRepresentation binRep3 = new BinaryRepresentation();
					
			binRep1 = convert(userInput);
			binRep2 = convert(userInput2);
			binRep3 = convert(userInput / userInput2);

			binRep1.displayValues();
			binRep2.displayValues();
			System.out.println("final product is ");
			binRep3.displayValues();
			
			binRep3.setBinary(binRep3.getSign(), binRep3.getExponent(), binRep2.getMantissa());
			// jam it into an 8 bit format
			System.out.println("in 8 bit format = " + Arrays.toString(binRep3.getBinary()));
		}
	}
}

