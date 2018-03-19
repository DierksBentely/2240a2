package assign2;

public class Shifts 
{
	public int[] shiftL(int[] whole, int[] frac)
	{
		int[] temp = new int[frac.length+1];
		temp[0] = whole[whole.length-1];
		for (int i = 0; i < frac.length; i++)
		{
			temp[i+1] = frac[i];
		}
		return temp;
	}	
	
	public int[] shiftMantis(int[] bin1)
	{
		int[] temp = new int[bin1.length+1];
		
		for(int i = 0; i < bin1.length;i++)
		{
			temp[0] =0;
			temp[i+1] = bin1[i];
		}
		return temp;
	}
	
	public int[] shiftFirstMantis(int[] bin1)
	{
		int[] temp = new int[bin1.length+1];
		
		for(int i = 0; i < bin1.length;i++)
		{
			temp[0] =1;
			temp[i+1] = bin1[i];
		}
		return temp;
	}
		
}
