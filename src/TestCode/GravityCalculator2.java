package TestCode;

public class GravityCalculator2 
{
	public static double multi(double x, double y)
	{
		return x*y;
	}
	
	public static double power (double x, double y)
	{
		return Math.pow(x,y);
	}
	
	public static double sum (double x, double y)
	{
		return x+y;
	}
	
	public static void outline (double finalPosition, double finalVelocity, int time)
	{
		System.out.printf("The object's position after %d seconds is %.02f m. \n", time, finalPosition);
		System.out.printf("The object's velocity after %d seconds is %.02f m/s.", time, finalVelocity);
	}
	
	public static void main(String[] arguments)
	{
		double gravity =-9.81; // Earth's gravity in m/s^2
		int fallingTime = 10;
		double initialVelocity = 0.0;
		double finalVelocity = sum(multi(gravity,fallingTime), initialVelocity);
		double initialPosition = 0.0;
		double finalPosition = sum(sum(multi(multi(0.5,gravity),power(fallingTime,2)), (initialVelocity*fallingTime)), initialPosition);
		outline (finalPosition, finalVelocity, fallingTime);
			}
}
