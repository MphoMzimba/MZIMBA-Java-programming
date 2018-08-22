/*####################################################
*						     *
 File Name : calc.java
* 						     *
 Creation Date : 22-08-2018
*						     *
 Last Modified : Wed 22 Aug 2018 13:01:39 SAST
* 						     *
 Create By : MphoMzimba				     
*						     *
 https://github.com/MphoMzimba/MZIMBA.git	     
*						     *
####################################################*/

import java.util.Scanner;
public class calc
{
	public static void main(String[] a)
	{
		Scanner scan = new Scanner(System.in);
		double x, y;
		double total = 0;
		String op;
		System.out.println("enter 1st number");
		x = scan.nextDouble();
		System.out.println("enter 1 of the following opertions +, -, *, /, %");
		op = scan.next();
		System.out.println("enter 2nd number");
		y = scan.nextDouble();

		if (op.equals("+"))
			total = x + y;
		else if (op.equals("-"))
			total = x - y;
		else if (op.equals("*"))
			total = x * y;
		else if (op.equals("/"))
			total = x / y;
		else if (op.equals("%"))
			total = x % y;
		else
			System.out.println("enter the correct operation");
		System.out.println("the result is");
		System.out.println(x + " " + op + " " + y + " = " + total);

	}
}
