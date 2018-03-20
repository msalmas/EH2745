import java.util.Scanner;

class ScannerAndKeyboard
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
		System.out.print( "Enter your name: "  );
		String name = s.nextLine();
		System.out.println( "Hello " + name + "!" );
		int foo = Integer.parseInt("18");
		System.out.println( foo );
		
	}
}