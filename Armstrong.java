public class ArmstrongNumber {
	public static boolean checkIfArmstrongNumber(int num)
	{
		int sum = 0 , temp1 = num , temp2 = 0 ;
		while(temp1>0)
		{
			temp2 = temp1 % 10;
			sum = sum + temp2 * temp2 * temp2;
			temp1 = temp1 / 10;
		}
		if(sum==num)
		{
			return true;
		}else {
			return false;
		}
	}
}