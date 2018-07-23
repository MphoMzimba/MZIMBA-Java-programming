/*####################################################
*						     *
 File Name : problem_a001.java
* 						     *
 Creation Date : 24-07-2018
*						     *
 Last Modified : Tue 24 Jul 2018 00:32:55 SAST
* 						     *
 Create By : MphoMzimba				     
*						     *
 https://github.com/MphoMzimba/MZIMBA.git	     
*						     *
####################################################*/

public class problem_a001
{
	public static void main (String[] args)
	{
		sum(1000, 50);
	}
	static void sum(int n, int q)
	{
		int x = q;
		int sum, temp = 0;

		while (x < n)
		{
			sum = x * (x + 1) / 2;
			System.out.println(String.format("Sum from %d to %d : %d", x - q + 1, x, sum - temp));
			System.out.println(String.format("Sum from %d to %d : %d", 1, x, sum));
			temp = sum;
			x += q;
		}
	}
}
