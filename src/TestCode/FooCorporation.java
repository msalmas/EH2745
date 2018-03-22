package TestCode;

public class FooCorporation {
	public static void main (String[] args)
	{
		Employee john = new Employee("John", 7.50, 38);
		Employee annabel = new Employee ("Annabel", 8.20, 42);
		Employee graham = new Employee ("Graham", 10.50, 41);
		Manager bill = new Manager ("Bill", 15.5, 39, "A332");
		Manager gregory = new Manager ("Gregory", 18.2, 40, "A415");
		
		john.salary();
		annabel.salary();
		graham.salary();
		bill.salary();
		gregory.salary();
		bill.office();
		gregory.office();
		
	}

}
