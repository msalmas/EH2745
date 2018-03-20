class Square
{
	static int value = 2;
	public static void printSquare(int x)
	{
		System.out.println(x*x);
	}
public static void main(String[] arguments)
{
	printSquare(value);
	printSquare(3);
	printSquare(value*2);
}
}