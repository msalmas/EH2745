package TestCode;

public class Employee
{

	String name;
	double pay;
	double hours;
	
	public Employee(String name, double pay, double hours)
	{
		this.name = name;
		this.pay = pay;
		this.hours = hours;
	}
	
		void salary ()
		{
			double salary;
			salary = pay * hours;
			System.out.printf("%s earned %.02f dollars. \n", name, salary);
		}
}




