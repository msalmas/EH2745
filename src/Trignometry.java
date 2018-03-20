import java.util.Scanner;
class trignometry
{
	public static double trig (double x)
	{
		x = Math.toRadians(x);
		return Math.sin(x);
	}
	
	public static double trig1 (double x)
	{
		x = Math.toRadians(x);
		return Math.cos(x);
	}
	
	public static double trig2 (double x, double y)
	{
		return Math.pow(x,y);
	}
	
	public static void main(String[] arguments)
	{
		Scanner s = new Scanner(System.in);
		System.out.print( "Enter the number to calculate its trignometric values: "  );
		double num = s.nextDouble();
		System.out.println("The sin of ("+ num +") = " + trig(num));
		System.out.println("The cos of ("+ num +") = " + trig1(num));
		System.out.print( "Enter the first number for raise to power: "  );
		int first = s.nextInt();
		System.out.print( "Enter the second number for raise to power: "  );
		int second = s.nextInt();
		System.out.println("The ("+ first +") raise to the power ("+ second +")  = " + trig2(first, second));
	}
}
