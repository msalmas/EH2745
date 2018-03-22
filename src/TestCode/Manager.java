package TestCode;

public class Manager extends Employee 
{

	String officeNumber;

	Manager(String name, double pay, int hours, String officeNumber)
	{

		super(name, pay, hours);

		this.officeNumber = officeNumber;
}
	
public void office()
{
// New method to print office number
System.out.printf("%s works in %s office. \n", super.name, officeNumber);
}
}